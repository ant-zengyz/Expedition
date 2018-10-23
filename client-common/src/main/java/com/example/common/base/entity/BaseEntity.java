package com.example.common.base.entity;

import com.example.common.tools.SnowflakesTool;
import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-21
 * @time: 0:25
 */
@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    @Id
    @Column(name="id")
    protected Long id;

    @Column(name="status" ,columnDefinition = " bigint(20) NOT NULL DEFAULT 1 comment '状态{0:禁用,1:启用}'")
    public Integer status;

    @Column(name="create_date", columnDefinition = " datetime NOT NULL comment '创建时间'")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date createDate;

    @Column(name = "update_date",columnDefinition = " timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '修改时间'")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @LastModifiedDate
    protected Date updateDate;

    @Column(name =  "create_user_id" ,columnDefinition = " bigint(20) NOT NULL DEFAULT 0 comment '创建人ID'")
    public Long createUserId;

    @Column(name =  "update_user_id" ,columnDefinition = " bigint(20) comment '更新人ID'")
    public Long updateUserId;

    @Column(name =  "sort" ,columnDefinition = " bigint(20) comment '排序'")
    public Long sort;

    public void init(Integer status,Long createUserId){
        this.id= SnowflakesTool.nextLongID();
        this.createDate=new Date();
        this.status=status;
        this.createUserId=createUserId;
    }
}
