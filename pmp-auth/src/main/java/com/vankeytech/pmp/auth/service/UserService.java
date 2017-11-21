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
     * 根据用户名或者登陆名查询用户信息
     * @param  user 用户名或者登陆名
     * @return 用户集合
     */
    List<User> selectByName(User user);

    /**
     *
     * @param user
     * @return
     */
    List<User> loadByCondition(User user);

    /**
     * 登录 根据登录名
     * @param user
     * @return
     */
    User login(User user);

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
     * 为用户配角色
     * @param userRole
     */
    void authorizationUser(UserRole userRole);




    /**
     * 分页查询
     * @param user
     * @return
     */
    PageInfo<User> selecePageByCondition(User user);




}
