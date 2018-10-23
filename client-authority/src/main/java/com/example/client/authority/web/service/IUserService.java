package com.example.client.authority.web.service;

import com.example.client.authority.data.entity.User;
import com.example.common.base.bean.ResultBean;
import com.example.common.domain.dto.authority.RepUserDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * 描述：
 *
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:21
 */
public interface IUserService {

    public ResultBean<List<RepUserDto>> findAll(Specification<User> specification, Pageable pageable);
}
