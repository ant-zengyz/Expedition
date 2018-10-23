package com.example.common.constants;

/**
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-21
 * @time: 0:25
 */
public enum  ResultEnum {

    /**
     * 统一成功返回状态
     */
    SUCC("200", "成功"),
    /**
     * 统一失败返回状态
     */
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
