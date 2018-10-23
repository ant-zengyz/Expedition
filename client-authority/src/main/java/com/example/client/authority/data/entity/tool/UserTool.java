package com.example.client.authority.data.entity.tool;

import com.example.client.authority.data.entity.User;
import com.example.common.domain.dto.authority.RepUserDto;

/**
 * 描述：
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:11
 */
public class UserTool {

    public static RepUserDto entityCopyToRepUserDto(User user){
        RepUserDto dto=new RepUserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setCreateDate(user.getCreateDate());
        dto.setUpdateDate(user.getUpdateDate());
        dto.setCreateUserId(user.getCreateUserId());
        dto.setUpdateUserId(user.getUpdateUserId());
        dto.setStatus(user.getStatus());
        return dto;
    }


}
