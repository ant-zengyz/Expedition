package com.example.common.base.bean;

import com.example.common.constants.ResultEnum;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 描述：
 * User: 曾远征
 * Date: 2018-10-21
 * Time: 21:34
 */
@Data
@Slf4j
public class ResultBean<T> {

    /**
     * 返回编码
     */
    public String code;

    /**
     * 返回提示语
     */
    public String msg;

    /**
     * 分页数据
     */
    public Long size = 1L;

    /**
     * 返回数据
     */
    public T result;

    public static ResultBean renderMsg(ResultEnum resultEnum, Object data) {
        return renderMsg(resultEnum.getCode(), resultEnum.getMsg(), data);
    }

    public static ResultBean renderMsg(String code, String msg, Object data) {
        ResultBean result = new ResultBean();
        result.code = code;
        result.msg = msg;
        result.result = data;
        return result;
    }

    public static ResultBean renderMsg(ResultEnum resultEnum) {
        return renderMsg(resultEnum, null);
    }

    public static ResultBean renderMsg(Object data) {
        if (data != null) {
            return renderMsg(ResultEnum.SUCC, data);
        } else {
            return renderMsg(ResultEnum.FAILED, data);
        }
    }

    public static ResultBean renderMsgWithSize(Object data, Long size) {
        ResultBean result = new ResultBean();
        result.code = ResultEnum.SUCC.getCode();
        result.msg = ResultEnum.SUCC.getMsg();
        result.result = data;
        result.size = size;
        return result;
    }
}
