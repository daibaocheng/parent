package com.vankeytech.pmp.auth.intf.impl;


import com.github.pagehelper.PageInfo;
import com.sun.xml.internal.bind.v2.model.runtime.RuntimeLeafInfo;
import com.vankeytech.pmp.auth.entity.Permission;
import com.vankeytech.pmp.auth.entity.Role;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.entity.UserRole;
import com.vankeytech.pmp.auth.intf.UserIntf;
import com.vankeytech.pmp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author  xieliang
 */
@Service
public class UserIntfImpl  implements UserIntf {
    public UserIntfImpl() {
        super();
    }

    @Autowired
    private UserService userService;


    /**
     * 修改用户密码
     *
     * @return
     */
    @Override
    public void updatePassword(User user) {
        userService.updatePassword(user);
    }

    /**
     * 根据id删除用户
     *
     * @param ids
     */
    @Override
    public void deleteByIds(Integer ids) {
        userService.deleteByuserId(ids);
    }

    /**
     * 用户登录查询
     *
     * @param userName
     * @return
     */
    @Override
    public User login(String userName) {
        return userService.login(userName);
    }

    /**
     * 根据id查询用户信息
     *
     * @param ids
     * @return
     */
    @Override
    public User load(int ids) {
        return null;
    }

    /**
     * 更新用户状态 启用或禁用
     *
     * @param user
     */
    @Override
    public void updateStatus(User user) {
        userService.updateStatus(user);
    }

    /**
     * 分页查询
     *
     * @param page     页数
     * @param pageSize 每页数量
     * @return
     */
    @Override
    public PageInfo pageUser(Integer page, Integer pageSize) {
        return null;
    }

    /**
     * 更新用户的所管理的小区
     *
     * @param user
     */
    @Override
    public void updateAeaId(User user) {
        userService.updateArea(user);
    }

    /**
     * 条件查询 根据用户或者注册名查询
     *
     * @param user 用户名称或者注册名称
     * @return 用户集合
     */
    @Override
    public List<User> selecteByName(User user) {

        return userService.selectByName(user);
    }

    /**
     * 根据所在部门和 用户名或注册名查询
     * @param user 部门id
     * @return
     */
    @Override
    public List<User> selectByCondition(User user) {
        return null;
    }

    /**
     * 为用户授予角色
     *
     * @param userRole 用户角色中间表
     */
    @Override
    public void authorizationUser(UserRole userRole) {

    }


    /**
     * 根据用户id查询用户的角色
     *
     * @param userId
     */
    @Override
    public List<Role> getUserRole(Integer userId) {
        List<Role> roleList=userService.getUserRoles(userId);
        return roleList;
    }

    /**
     * 根据用户角色id 查询用户的权限
     *
     * @param roleIds
     */
    @Override
    public List<Permission>  getPermisstion(List<Integer> roleIds) {
        List<Permission> permissionList=userService.getUserPermisstion(roleIds);
        return permissionList;
    }
}
