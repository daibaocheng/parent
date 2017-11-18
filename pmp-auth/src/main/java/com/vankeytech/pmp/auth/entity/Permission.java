package com.vankeytech.pmp.auth.entity;

import javax.persistence.*;

@Table(name = "pmp_permission")
public class Permission {
    /**
     * 权限表id
     */
    @Id
    @Column(name = "permission_id")
    private Long permissionId;

    /**
     * 权限名称
     */
    @Column(name = "permission_name")
    private String permissionName;

    /**
     * 父权限id
     */
    private Long pid;

    /**
     * 权限等级
     */
    @Column(name = "permission_level")
    private Integer permissionLevel;

    /**
     * 权限地址
     */
    @Column(name = "permission_url")
    private String permissionUrl;

    /**
     * 权限描述
     */
    @Column(name = "permission_describe")
    private String permissionDescribe;

    /**
     * 权限菜单对应的图标
     */
    @Column(name = "menu_icon")
    private String menuIcon;

    /**
     * 获取权限表id
     *
     * @return permission_id - 权限表id
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * 设置权限表id
     *
     * @param permissionId 权限表id
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取权限名称
     *
     * @return permission_name - 权限名称
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 设置权限名称
     *
     * @param permissionName 权限名称
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    /**
     * 获取父权限id
     *
     * @return pid - 父权限id
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父权限id
     *
     * @param pid 父权限id
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取权限等级
     *
     * @return permission_level - 权限等级
     */
    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    /**
     * 设置权限等级
     *
     * @param permissionLevel 权限等级
     */
    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    /**
     * 获取权限地址
     *
     * @return permission_url - 权限地址
     */
    public String getPermissionUrl() {
        return permissionUrl;
    }

    /**
     * 设置权限地址
     *
     * @param permissionUrl 权限地址
     */
    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    /**
     * 获取权限描述
     *
     * @return permission_describe - 权限描述
     */
    public String getPermissionDescribe() {
        return permissionDescribe;
    }

    /**
     * 设置权限描述
     *
     * @param permissionDescribe 权限描述
     */
    public void setPermissionDescribe(String permissionDescribe) {
        this.permissionDescribe = permissionDescribe;
    }

    /**
     * 获取权限菜单对应的图标
     *
     * @return menu_icon - 权限菜单对应的图标
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * 设置权限菜单对应的图标
     *
     * @param menuIcon 权限菜单对应的图标
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }
}