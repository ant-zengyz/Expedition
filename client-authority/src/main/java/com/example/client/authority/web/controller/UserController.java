package com.example.client.authority.web.controller;

import com.alibaba.fastjson.JSON;
import com.example.client.authority.data.entity.User;
import com.example.client.authority.web.service.IUserService;
import com.example.client.authority.web.service.specification.UserSpecification;
import com.example.common.base.bean.ResultBean;
import com.example.common.domain.dto.authority.RepUserDto;
import com.example.common.domain.dto.authority.ReqUserDto;
import com.example.common.routes.authority.AuthorityRoutes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:41
 */
@RestController
@ResponseBody
@Slf4j
public class UserController {

    @Autowired
    public IUserService userService;

    @GetMapping(AuthorityRoutes.PATH_USER_PAGE_LIST)
    public ResultBean<List<RepUserDto>> findUserPageList(@RequestBody ReqUserDto reqUserDto){
        Specification<User> specification = UserSpecification.buildFromDTO(reqUserDto);
        ResultBean<List<RepUserDto>> result = userService.findAll(specification, reqUserDto.getPage());
        log.info("查询结果为：{}", JSON.toJSON(result));
        return result;
    }
}
