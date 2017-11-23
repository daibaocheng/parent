package com.vankeytech.pmp.api.pojo;

import com.vankeytech.pmp.api.constant.ResponseCode;

import java.io.Serializable;

/**
 * Json返回数据格式
 * @author AlexWong
 * @param <T> 装载的数据对象
 */
public class JsonResult<T> implements Serializable {
    /** 返回码 */
    private int code;
    /** 消息 */
    private String msg;
    /** 装载的数据对象 */
    private T payload;

    public JsonResult() {
    }

    public JsonResult(int code, String msg) {
        this(code, msg, null);
    }

    public JsonResult(ResponseCode code) {
        this(code.getCode(), code.getMsg());
    }

    public JsonResult(int code, String msg, T payload) {
        this.code = code;
        this.msg = msg;
        this.payload = payload;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
