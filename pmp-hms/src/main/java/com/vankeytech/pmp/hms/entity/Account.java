package com.vankeytech.pmp.hms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hms_account")
public class Account {
    /**
     * 账号ID
     */
    @Id
    @Column(name = "account_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNo;

    /**
     * 住户编号
     */
    private Long user;

    /**
     * 账号类型
     */
    @Column(name = "account_type")
    private String accountType;

    /**
     * 创建时间
     */
    @Column(name = "creat_time")
    private Date creatTime;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    private Long loginCount;

    /**
     * 账户状态
     */
    @Column(name = "account_status")
    private Long accountStatus;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取账号ID
     *
     * @return account_no - 账号ID
     */
    public Long getAccountNo() {
        return accountNo;
    }

    /**
     * 设置账号ID
     *
     * @param accountNo 账号ID
     */
    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 获取住户编号
     *
     * @return user - 住户编号
     */
    public Long getUser() {
        return user;
    }

    /**
     * 设置住户编号
     *
     * @param user 住户编号
     */
    public void setUser(Long user) {
        this.user = user;
    }

    /**
     * 获取账号类型
     *
     * @return account_type - 账号类型
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置账号类型
     *
     * @param accountType 账号类型
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取创建时间
     *
     * @return creat_time - 创建时间
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置创建时间
     *
     * @param creatTime 创建时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * 获取登录次数
     *
     * @return login_count - 登录次数
     */
    public Long getLoginCount() {
        return loginCount;
    }

    /**
     * 设置登录次数
     *
     * @param loginCount 登录次数
     */
    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 获取账户状态
     *
     * @return account_status - 账户状态
     */
    public Long getAccountStatus() {
        return accountStatus;
    }

    /**
     * 设置账户状态
     *
     * @param accountStatus 账户状态
     */
    public void setAccountStatus(Long accountStatus) {
        this.accountStatus = accountStatus;
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