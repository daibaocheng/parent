package com.vankeytech.pmp.pms.util;


import com.vankeytech.pmp.pms.constant.ResponseCode;

/**
 * @author AlexWong
 */
public class ResponseUtil {
    public static JsonResult success() {
        return new JsonResult(ResponseCode.SUCCESS_CODE, ResponseCode.SUCCESS_MSG);
    }

    public static JsonResult success(Object data) {
        return new JsonResult(ResponseCode.SUCCESS_CODE, ResponseCode.SUCCESS_MSG, data);
    }
}
