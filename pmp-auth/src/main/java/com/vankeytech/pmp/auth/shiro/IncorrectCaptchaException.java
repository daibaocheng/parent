package com.vankeytech.pmp.auth.shiro;

import org.apache.shiro.authc.AuthenticationException;

/**
 * 验证码错误异常
 * @author chenqiu
 *
 */
public class IncorrectCaptchaException extends AuthenticationException {

    private static final long serialVersionUID = -900348704002542821L;

    public IncorrectCaptchaException() {
        super();
    }

    public IncorrectCaptchaException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectCaptchaException(String message) {
        super(message);
    }

    public IncorrectCaptchaException(Throwable cause) {
        super(cause);
    }
}
