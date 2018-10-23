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
 * @time: 23:12
 */
@Entity
@EntityListeners(Role.class)
@Table(name="t_role")
@Data
public class Role extends BaseEntity {

    @Column(name="name", columnDefinition = "varchar(64) NOT NULL comment '角色名称'")
    private String name;

    @Column(name="code", columnDefinition = "varchar(64) NOT NULL comment '角色编码'")
    private String code;

    @Column(name="description", columnDefinition = "varchar(100) comment '角色描述'")
    private String description;

}
