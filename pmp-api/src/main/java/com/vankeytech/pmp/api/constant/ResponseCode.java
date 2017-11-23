package com.vankeytech.pmp.api.constant;

/**
 * Json返回消息枚举
 * @author AlexWong
 */
public enum ResponseCode {
    SUCCESS(200, "成功");

    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
