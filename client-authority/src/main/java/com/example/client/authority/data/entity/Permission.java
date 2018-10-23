package com.example.client.authority.data.entity;

import com.example.common.base.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

/**
 * 描述：
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:14
 */
@Entity
@EntityListeners(Role.class)
@Table(name="t_permission")
@Data
public class Permission extends BaseEntity {

    @Column(name="name", columnDefinition = "varchar(64) NOT NULL comment '权限名称'")
    private String name;

    @Column(name="path", columnDefinition = "varchar(64) NOT NULL comment '权限路径'")
    private String path;

    @Column(name="description", columnDefinition = "varchar(100) comment '权限描述'")
    private String description;

    @Column(name="code", columnDefinition = "varchar(64) NOT NULL comment '权限编码'")
    private String code;

    @Column(name="p_id", columnDefinition = "bigint(20) NOT NULL comment '上级权限'")
    private String pId;

    @Column(name="type", columnDefinition = "bigint(20) NOT NULL comment '权限类型'")
    private Integer type;
}
