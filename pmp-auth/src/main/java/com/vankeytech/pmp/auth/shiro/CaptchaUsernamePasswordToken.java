package com.vankeytech.pmp.auth.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 在用户名和密码的基础上添加验证码的Token
 * @author xieliang
 *
 */
public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {
    private static final long serialVersionUID = 4676958151524148623L;
    
    private String captcha;
    
    public CaptchaUsernamePasswordToken(String username, String password, boolean rememberMe, String host, String captcha) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
