package com.vankeytech.pmp.pms.constant;

/**
 * @author daibaocheng
 */
public class ResponseCode {
    private ResponseCode() {}

    public static final int SUCCESS_CODE = 200;
    public static final String SUCCESS_MSG = "成功";

    public static final int INVALID_TOKEN_CODE = 312;
    public static final String INVALID_TOKEN_MSG = "token无效或已过期";

    public static final int PARAM_ERR_CODE = 400;
    public static final String PARAM_ERR_MSG = "参数错误";

    public static final int REQUEST_ERR_CODE = 404;
    public static final String REQUEST_ERR_MSG = "请求错误";

    public static final int INTERNAL_ERR_CODE = 500;
    public static final String INTERNAL_ERR_MSG = "业务层异常";
}
