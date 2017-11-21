package com.vankeytech.pmp.auth.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "auth_role")
public class Role {
    /**
     * 角色id
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 角色类型
     */
    @Column(name = "role_type")
    private String roleType;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色描述
     */
    @Column(name = "role_describe")
    private String roleDescribe;

    /**
     * 角色状态启用状态禁用状态
     */
    @Column(name = "role_status")
    private Integer roleStatus;

    /**
     * 创建角色的时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 父级角色的id用于自连
     */
    private Long pid;

    /**
     * 修改的时间
     */
    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色类型
     *
     * @return role_type - 角色类型
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * 设置角色类型
     *
     * @param roleType 角色类型
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色描述
     *
     * @return role_describe - 角色描述
     */
    public String getRoleDescribe() {
        return roleDescribe;
    }

    /**
     * 设置角色描述
     *
     * @param roleDescribe 角色描述
     */
    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }

    /**
     * 获取角色状态启用状态禁用状态
     *
     * @return role_status - 角色状态启用状态禁用状态
     */
    public Integer getRoleStatus() {
        return roleStatus;
    }

    /**
     * 设置角色状态启用状态禁用状态
     *
     * @param roleStatus 角色状态启用状态禁用状态
     */
    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    /**
     * 获取创建角色的时间
     *
     * @return created_at - 创建角色的时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建角色的时间
     *
     * @param createdAt 创建角色的时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取父级角色的id用于自连
     *
     * @return pid - 父级角色的id用于自连
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父级角色的id用于自连
     *
     * @param pid 父级角色的id用于自连
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取修改的时间
     *
     * @return updated_at - 修改的时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置修改的时间
     *
     * @param updatedAt 修改的时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}