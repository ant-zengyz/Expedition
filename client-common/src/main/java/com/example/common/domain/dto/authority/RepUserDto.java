package com.example.common.domain.dto.authority;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述：
 *
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:26
 */
@Data
public class RepUserDto implements Serializable {

    private Long id;
    private String username;
    private Date createDate;
    private Date updateDate;
    private Long createUserId;
    private String createUserNickName;
    private Long updateUserId;
    private String updateUserNickName;
    private Integer status;
}
