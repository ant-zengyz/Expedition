package com.example.client.authority.web.service.impl;

import com.example.client.authority.data.entity.User;
import com.example.client.authority.data.entity.tool.UserTool;
import com.example.client.authority.data.repository.UserRepository;
import com.example.client.authority.web.service.IUserService;
import com.example.common.base.bean.ResultBean;
import com.example.common.domain.dto.authority.RepUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:21
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public ResultBean<List<RepUserDto>> findAll(Specification<User> specification, Pageable pageable) {
        Page<User> userPage = userRepository.findAll(specification, pageable);
        List<RepUserDto> repUserDtos=new ArrayList<>();
        userPage.forEach(resut->{
            RepUserDto dto = UserTool.entityCopyToRepUserDto(resut);
            repUserDtos.add(dto);
        });
        return ResultBean.renderMsgWithSize(repUserDtos,userPage.getTotalElements());
    }
}
