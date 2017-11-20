package com.vankeytech.pmp.auth.service;


import com.github.pagehelper.PageInfo;
import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.auth.entity.Permission;
import com.vankeytech.pmp.auth.entity.Role;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.entity.UserRole;

import java.util.List;

/**
 * @author xieliang
 */
public interface UserService extends Service<User> {

    /**
     * 根据用户id 更新用户的所属小区
     * @param user
     */
    void updateArea(User user);

    /**
     * 根据用户名或者登陆名查询用户信息
     * @param  user 用户名或者登陆名
     * @return 用户集合
     */
    List<User> selectByName(User user);

    /**
     * 登录 根据登录名
     * @param registerName
     * @return
     */
    User login(String registerName);

    /**
     * 获取用户对应角色
     * @param userId 用户id
     * @return  该用户的角色集合
     */
    List<Role> getUserRoles(Integer userId);

    /**
     * 获取用户权限
     * @param roleIds  用户对应的角色id集合
     * @return 权限集合
     */
    List<Permission> getUserPermisstion(List<Integer>  roleIds);

    /**
     * 更新密码
     * @param user
     */
    void updatePassword(User user);

    /**
     * 根据id删除用户 软删
     * @param userId
     */
    void deleteByuserId(Integer userId);

    /**
     * 为用户配角色
     * @param userRole
     */
    void authorizationUser(UserRole userRole);

    /**
     * 更新用户的状态 启用还是禁用 1启用 0禁用
     * @param user
     */
    void updateStatus(User user);

    /**
     * 查询并分页
     * @return
     */
    PageInfo<User> selectPage();

    /**
     * 条件查询并分页返回
     * @param user
     * @return
     */
    PageInfo<User> selectPageBycondition(User user);

}
