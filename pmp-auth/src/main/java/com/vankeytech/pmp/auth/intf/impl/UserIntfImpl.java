package com.vankeytech.pmp.auth.intf.impl;


import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.entity.Permission;
import com.vankeytech.pmp.auth.entity.Role;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.entity.UserRole;
import com.vankeytech.pmp.auth.intf.UserIntf;
import com.vankeytech.pmp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * 添加员工信息
     *
     * @param user
     */
    @Override
    public void addUser(User user) {
        userService.insert(user);
    }

    /**
     * 修改用户密码
     *
     * @return
     */
    @Override
    public void updatePassword(User user) {
        userService.updateByPrimaryKeySelective(user);
    }

    /**
     * 根据id删除用户
     *
     * @param user
     */
    @Override
    public void deleteByIds(User user) {
        userService.updateByPrimaryKeySelective(user);
    }

    /**
     * 用户登录查询
     *
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        return userService.login(user);
    }

    /**
     * 根据id查询用户信息
     * @param user
     * @return
     */
    @Override
    public User loadById(User user) {
        return userService.selectOne(user);
    }

    /**
     * 更新用户状态 启用或禁用
     *
     * @param user
     */
    @Override
    public void updateStatus(User user) {
        userService.updateByPrimaryKeySelective(user);
    }

    /**
     * 分页查询
     * @param page     页数
     * @param pageSize 每页数量
     * @return
     */
    @Override
    public PageInfo pageUser(Integer page, Integer pageSize,User user) {

        return userService.selecePageByCondition(page,pageSize,user);
    }

    /**
     * 更新用户的所管理的小区
     *
     * @param user
     */
    @Override
    public void updateAeaId(User user) {
        userService.updateByPrimaryKeySelective(user);
    }




    /**
     * 为用户授予角色
     *
     * @param userRole 用户角色中间表
     */
    @Override
    public void authorizationUser(UserRole userRole) {
            userService.authorizationUser(userRole);
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

    /**
     * 更新用户登录时间和用户登录的次数
     *
     * @param user
     */
    @Override
    public void updateLoinInfo(User user) {
        userService.updateByPrimaryKeySelective(user);
    }
}
