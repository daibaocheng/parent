package com.vankeytech.pmp.api.util;

import com.vankeytech.pmp.api.constant.ResponseCode;
import com.vankeytech.pmp.api.pojo.JsonResult;

/**
 * 返回JSON数据工具类
 * @author AlexWong
 */
public class ResponseUtil {

    public static JsonResult success() {
        return new JsonResult(ResponseCode.SUCCESS);
    }

    public static <T> JsonResult success(T payload) {
        return new JsonResult<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg(), payload);
    }

}
