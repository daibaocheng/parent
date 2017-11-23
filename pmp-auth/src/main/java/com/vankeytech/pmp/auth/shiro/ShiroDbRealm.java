package com.vankeytech.pmp.auth.shiro;

import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.authz.AuthorizationInfo;

import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *  基于db实现的shiro realm 
 * @author chenqiu
 *
 */
public class ShiroDbRealm extends AuthorizingRealm {
    /**
     * passwordService 加密
     */
	private PasswordService passwordService;

	@Autowired
	private UserService userService;

    public ShiroDbRealm(){
        setAuthenticationTokenClass(CaptchaUsernamePasswordToken.class);
    }

    public void setPasswordService(PasswordService passwordService) {  
        this.passwordService = passwordService;  
    }  


    /**
     * 认证回调函数,登录时调用.
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token){
        CaptchaUsernamePasswordToken authcToken = (CaptchaUsernamePasswordToken) token;
        String accountName = authcToken.getUsername();

        if (accountName != null) {
            throw new AuthenticationException("用户名不可以为空");
        }
        //执行数据库查询
       User user = userService.selectOne(new User());

        if (null == user) {
            throw new AuthenticationException("用户名或者密码错误");
        }
        return  new SimpleAuthenticationInfo(new SessionUser(user.getUserId() ,user.getUserName() ,user.getUserEmial() ,user.getUserPhone()),user.getUserPassword(),user.getUserName());

    }


    @Override
    protected void assertCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) throws AuthenticationException {

        super.assertCredentialsMatch(token, info);
    }

    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();


        return info;
    }
  

    /**
     * 更新用户授权信息缓存.
     */
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    /**
     * 清除所有用户授权信息缓存.
     */
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }
}
