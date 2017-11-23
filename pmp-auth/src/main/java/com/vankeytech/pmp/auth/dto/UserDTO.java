package com.vankeytech.pmp.auth.dto;


import java.io.Serializable;

/**
 * 数据传输层 用于显示层后应用层之间的数据传输
 * @author  xieliang
 */
public class UserDTO implements Serializable {

    /**
     * 用户id
     */
    private String  userId;

    /**
     * 登录名
     */
    private String userRegisterAccount;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户所属部门
     */
    private String departmentName;

    /**
     * 用户角色名称
     */
    private String roleName;

    /**
     * 角色类型
     */
    private String roleType;

    /**
     * 用户所管理小区
     */
    private String areaName;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRegisterAccount() {
        return userRegisterAccount;
    }

    public void setUserRegisterAccount(String userRegisterAccount) {
        this.userRegisterAccount = userRegisterAccount;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId='" + userId + '\'' +
                ", userRegisterAccount='" + userRegisterAccount + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleType='" + roleType + '\'' +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}
