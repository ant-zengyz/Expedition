package com.example.common.domain.dto.authority;

import com.example.common.base.bean.PagingBean;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：
 *
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:24
 */
@Data
public class ReqUserDto extends PagingBean implements Serializable {

    private String username;
}
