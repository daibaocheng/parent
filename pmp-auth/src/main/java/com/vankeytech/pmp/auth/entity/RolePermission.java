package com.vankeytech.pmp.auth.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author  xieliang
 */
@Table(name = "auth_role_permission")
public class RolePermission implements Serializable {
    /**
     * 中间表id
     */
    @Id
    @Column(name = "role_permission_id")
    private Long rolePermissionId;

    /**
     * 外键 对应角色表中id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 外键 对应权限表中id
     */
    @Column(name = "permission_id")
    private Long permissionId;

    /**
     * 获取中间表id
     *
     * @return role_permission_id - 中间表id
     */
    public Long getRolePermissionId() {
        return rolePermissionId;
    }

    /**
     * 设置中间表id
     *
     * @param rolePermissionId 中间表id
     */
    public void setRolePermissionId(Long rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    /**
     * 获取外键 对应角色表中id
     *
     * @return role_id - 外键 对应角色表中id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置外键 对应角色表中id
     *
     * @param roleId 外键 对应角色表中id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取外键 对应权限表中id
     *
     * @return permission_id - 外键 对应权限表中id
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * 设置外键 对应权限表中id
     *
     * @param permissionId 外键 对应权限表中id
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}