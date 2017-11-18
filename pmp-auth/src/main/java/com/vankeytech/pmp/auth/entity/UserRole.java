package com.vankeytech.pmp.auth.entity;

import javax.persistence.*;

@Table(name = "pmp_user_role")
public class UserRole {
    /**
     * id编号
     */
    @Id
    @Column(name = "user_role_id")
    private Long userRoleId;

    /**
     * 外键外联用户表
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 外键外联角色表
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 获取id编号
     *
     * @return user_role_id - id编号
     */
    public Long getUserRoleId() {
        return userRoleId;
    }

    /**
     * 设置id编号
     *
     * @param userRoleId id编号
     */
    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * 获取外键外联用户表
     *
     * @return user_id - 外键外联用户表
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置外键外联用户表
     *
     * @param userId 外键外联用户表
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取外键外联角色表
     *
     * @return role_id - 外键外联角色表
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置外键外联角色表
     *
     * @param roleId 外键外联角色表
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}