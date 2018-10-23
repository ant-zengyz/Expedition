package com.example.common.constants;

/**
 * 描述：
 * User: 曾远征
 * Date: 2018-10-21
 * Time: 21:40
 */
public enum  ResultEnum {

    SUCC("200", "成功"),
    FAILED("500", "失败");

    private String code;

    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
