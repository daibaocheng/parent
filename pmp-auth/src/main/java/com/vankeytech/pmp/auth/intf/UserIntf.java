package com.vankeytech.pmp.auth.intf;

import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.entity.Permission;
import com.vankeytech.pmp.auth.entity.Role;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.entity.UserRole;

import java.util.List;

/**
 *
 * @author xieliang
 */
public interface UserIntf {

    /**
     * 修改用户密码
     * @return
     */
    void updatePassword(User user);

    /**
     * 根据id删除用户
     * @param user
     */
     void deleteByIds(User user);

    /**
     * 用户登录查询
     * @return
     */
     User login(User user);

    /**
     * 根据id查询用户信息
     * @param user
     * @return
     */
     User loadById(User user);

    /**
     * 更新用户状态 启用或禁用
     * @param user
     */
    void updateStatus(User user);

    /**
     * 分页查询
     * @param page  页数
     * @param pageSize  每页数量
     * @return
     */
    PageInfo pageUser(Integer page, Integer pageSize,User user);

    /**
     * 更新用户的所管理的小区
     * @param user
     */
    void updateAeaId(User user);

    /**
     * 条件查询 根据用户或者注册名查询
     * @param  user  用户名称或者注册名称
     * @return  用户集合
     */
    List<User> selecteByNames(User user);

    /**
     * 根据所在部门和 用户名或注册名查询
     * @param user
     * @return
     */
    List<User> selectByCondition(User user);

    /**
     * 为用户授予角色
     * @param userRole  用户权限中间表
     */
    void authorizationUser(UserRole userRole);

    /**
     * 根据用户id查询用户的角色
     * @param userId
     */
    List<Role> getUserRole(Integer userId);

    /**
     * 根据用户角色id 查询用户的权限
     * @param roleIds
     */
    List<Permission> getPermisstion(List<Integer> roleIds);

    /**
     * 更新用户登录时间和用户登录的次数
     * @param user
     */
    void updateLoinInfo(User user);


}
