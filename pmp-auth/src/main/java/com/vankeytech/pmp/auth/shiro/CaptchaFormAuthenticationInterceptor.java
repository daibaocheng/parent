package com.vankeytech.pmp.auth.shiro;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 带验证码的表单验证拦截器  
 * @author xieliang
 *
 */
public class CaptchaFormAuthenticationInterceptor extends FormAuthenticationFilter implements HandlerInterceptor {

    private String captchaParam = "captcha";

    public String getCaptchaParam() {
        return captchaParam;
    }

    protected String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }


    protected AuthenticationToken createToken(HttpServletRequest request) {
        //获取登录的用户名 密码 验证码 并保存
        String username = getUsername(request);
        String password = getPassword(request);
        String captcha = getCaptcha(request);
        boolean rememberMe = isRememberMe(request);
        String host = getHost(request);

        return new CaptchaUsernamePasswordToken(username, password, rememberMe, host, captcha);
    }

    /**
     * 在调用controller之前调用
     * @param request 请求
     * @param response 返回
     * @return 返回true 继续往下执行 false结束
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpServletRequest request2 =(HttpServletRequest)request;
        AuthenticationToken authenticationToken = createToken(request2);
        request.setAttribute("shiroToken", authenticationToken);
        return true;
    }

    /**
     * 在controller调用之后执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView  试图
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    /**
     * 在请求完成之后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }
}
