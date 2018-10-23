package com.example.client.authority.data.entity;

import com.example.common.base.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

/**
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:13
 */
@Entity
@EntityListeners(User.class)
@Table(name="t_user")
@Data
public class User extends BaseEntity {


    @Column(name="username", columnDefinition = "varchar(64) NOT NULL comment '用户名'")
    private String username;

    @Column(name="password", columnDefinition = "varchar(64) NOT NULL comment '密码'")
    private String passowrd;

}
