package com.vankeytech.pmp.auth.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * @author  xieliang
 */
@Table(name = "auth_user")
public class User {
    /**
     * 用户编号
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户的注册名
     */
    @Column(name = "user_register_account")
    private String userRegisterAccount;

    /**
     * 用户名
     */
    private String nickname;

    /**
     * 所在小区id
     */
    @Column(name = "area_id")
    private Long areaId;

    /**
     * 用户状态 启用或者禁用
     */
    @Column(name = "user_status")
    private Integer userStatus;

    /**
     * 用户登录密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 用户最后登录时间
     */
    @Column(name = "finally_login_time")
    private Date finallyLoginTime;

    /**
     * 登录次数
     */
    @Column(name = "login_count")
    private Long loginCount;

    /**
     * 软删除id
     */
    @Column(name = "deleted_id")
    private Integer deletedId;

    /**
     * 注册的时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 用户emial
     */
    @Column(name = "user_emial")
    private String userEmial;

    /**
     * 用户的电话
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 用户的真实姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 最后一次修改的时间
     */
    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * 用户头像存放地址
     */
    @Column(name = "portrait_url")
    private String portraitUrl;

    /**
     * 用户所属部门id
     */
    @Column(name = "department_id")
    private Long departmentId;

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户的注册名
     *
     * @return user_register_account - 用户的注册名
     */
    public String getUserRegisterAccount() {
        return userRegisterAccount;
    }

    /**
     * 设置用户的注册名
     *
     * @param userRegisterAccount 用户的注册名
     */
    public void setUserRegisterAccount(String userRegisterAccount) {
        this.userRegisterAccount = userRegisterAccount;
    }

    /**
     * 获取用户名
     *
     * @return nickname - 用户名
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户名
     *
     * @param nickname 用户名
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取所在小区id
     *
     * @return area_id - 所在小区id
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 设置所在小区id
     *
     * @param areaId 所在小区id
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取用户状态 启用或者禁用
     *
     * @return user_status - 用户状态 启用或者禁用
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 设置用户状态 启用或者禁用
     *
     * @param userStatus 用户状态 启用或者禁用
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取用户登录密码
     *
     * @return user_password - 用户登录密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置用户登录密码
     *
     * @param userPassword 用户登录密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取用户最后登录时间
     *
     * @return finally_login_time - 用户最后登录时间
     */
    public Date getFinallyLoginTime() {
        return finallyLoginTime;
    }

    /**
     * 设置用户最后登录时间
     *
     * @param finallyLoginTime 用户最后登录时间
     */
    public void setFinallyLoginTime(Date finallyLoginTime) {
        this.finallyLoginTime = finallyLoginTime;
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
     * 获取软删除id
     *
     * @return deleted_id - 软删除id
     */
    public Integer getDeletedId() {
        return deletedId;
    }

    /**
     * 设置软删除id
     *
     * @param deletedId 软删除id
     */
    public void setDeletedId(Integer deletedId) {
        this.deletedId = deletedId;
    }

    /**
     * 获取注册的时间
     *
     * @return create_at - 注册的时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置注册的时间
     *
     * @param createAt 注册的时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取用户emial
     *
     * @return user_emial - 用户emial
     */
    public String getUserEmial() {
        return userEmial;
    }

    /**
     * 设置用户emial
     *
     * @param userEmial 用户emial
     */
    public void setUserEmial(String userEmial) {
        this.userEmial = userEmial;
    }

    /**
     * 获取用户的电话
     *
     * @return user_phone - 用户的电话
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置用户的电话
     *
     * @param userPhone 用户的电话
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取用户的真实姓名
     *
     * @return user_name - 用户的真实姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户的真实姓名
     *
     * @param userName 用户的真实姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取最后一次修改的时间
     *
     * @return updated_at - 最后一次修改的时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置最后一次修改的时间
     *
     * @param updatedAt 最后一次修改的时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取用户头像存放地址
     *
     * @return portrait_url - 用户头像存放地址
     */
    public String getPortraitUrl() {
        return portraitUrl;
    }

    /**
     * 设置用户头像存放地址
     *
     * @param portraitUrl 用户头像存放地址
     */
    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }

    /**
     * 获取用户所属部门id
     *
     * @return department_id - 用户所属部门id
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置用户所属部门id
     *
     * @param departmentId 用户所属部门id
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

}