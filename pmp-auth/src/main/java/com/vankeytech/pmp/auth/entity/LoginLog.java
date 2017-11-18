package com.vankeytech.pmp.auth.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pmp_login_log")
public class LoginLog {
    /**
     * 登录日志的id编号
     */
    @Id
    @Column(name = "log_id")
    private Long logId;

    /**
     * 登录的时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 登录人员的用户名
     */
    @Column(name = "login_operation_name")
    private String loginOperationName;

    /**
     * 登录系统的IP地址
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录人员的id编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 获取登录日志的id编号
     *
     * @return log_id - 登录日志的id编号
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * 设置登录日志的id编号
     *
     * @param logId 登录日志的id编号
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * 获取登录的时间
     *
     * @return login_time - 登录的时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录的时间
     *
     * @param loginTime 登录的时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取登录人员的用户名
     *
     * @return login_operation_name - 登录人员的用户名
     */
    public String getLoginOperationName() {
        return loginOperationName;
    }

    /**
     * 设置登录人员的用户名
     *
     * @param loginOperationName 登录人员的用户名
     */
    public void setLoginOperationName(String loginOperationName) {
        this.loginOperationName = loginOperationName;
    }

    /**
     * 获取登录系统的IP地址
     *
     * @return login_ip - 登录系统的IP地址
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录系统的IP地址
     *
     * @param loginIp 登录系统的IP地址
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登录人员的id编号
     *
     * @return user_id - 登录人员的id编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置登录人员的id编号
     *
     * @param userId 登录人员的id编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}