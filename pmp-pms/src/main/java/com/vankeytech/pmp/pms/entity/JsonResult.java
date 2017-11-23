package com.vankeytech.pmp.pms.entity;

import java.io.Serializable;

/**
 * @author daibaocheng
 */
public class JsonResult implements Serializable {
    private int code;
    private String msg;
    private Object data;

    public JsonResult() {
    }

    public JsonResult(int code, String msg) {
        this(code, msg, null);
    }

    public JsonResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
