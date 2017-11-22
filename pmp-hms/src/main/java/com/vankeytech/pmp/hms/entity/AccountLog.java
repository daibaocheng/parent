package com.vankeytech.pmp.hms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hms_account_log")
public class AccountLog {
    /**
     * 帐号使用记录编号
     */
    @Id
    @Column(name = "account_log_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountLogNo;

    /**
     * 登录IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 登录地址IP
     */
    @Column(name = "login_address_id")
    private String loginAddressId;

    /**
     * 账号ID
     */
    private Long account;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取帐号使用记录编号
     *
     * @return account_log_no - 帐号使用记录编号
     */
    public Long getAccountLogNo() {
        return accountLogNo;
    }

    /**
     * 设置帐号使用记录编号
     *
     * @param accountLogNo 帐号使用记录编号
     */
    public void setAccountLogNo(Long accountLogNo) {
        this.accountLogNo = accountLogNo;
    }

    /**
     * 获取登录IP
     *
     * @return login_ip - 登录IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录IP
     *
     * @param loginIp 登录IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取登录地址IP
     *
     * @return login_address_id - 登录地址IP
     */
    public String getLoginAddressId() {
        return loginAddressId;
    }

    /**
     * 设置登录地址IP
     *
     * @param loginAddressId 登录地址IP
     */
    public void setLoginAddressId(String loginAddressId) {
        this.loginAddressId = loginAddressId;
    }

    /**
     * 获取账号ID
     *
     * @return account - 账号ID
     */
    public Long getAccount() {
        return account;
    }

    /**
     * 设置账号ID
     *
     * @param account 账号ID
     */
    public void setAccount(Long account) {
        this.account = account;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}