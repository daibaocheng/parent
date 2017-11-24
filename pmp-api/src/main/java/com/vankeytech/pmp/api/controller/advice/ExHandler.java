package com.vankeytech.pmp.api.controller.advice;

import com.vankeytech.pmp.api.constant.ResponseCode;
import com.vankeytech.pmp.api.pojo.JsonResult;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExHandler {
    @ExceptionHandler(BindException.class)
    public JsonResult binException() {
        return new JsonResult(ResponseCode.PARAM_ERR);
    }
}
