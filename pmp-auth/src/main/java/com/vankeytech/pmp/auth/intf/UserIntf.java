package com.vankeytech.pmp.auth.intf;

import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.entity.User;

import java.util.List;

/**
 *
 * @author xieliang
 */
public interface UserIntf {
    /**
     * 查询所有用户
     * @return
     */
     List<User> selectAll();

    /**
     * 修改用户密码
     * @return
     */
    Integer updatePassword();

    /**
     * 根据id删除用户
     * @param ids
     */
     void deleteByIds(Integer ids);

    /**
     * 用户登录查询
     * @return
     */
     User login(String userName);

    /**
     * 根据id查询用户信息
     * @param ids
     * @return
     */
     User load(int ids);

    /**
     * 更新用户状态 启用或禁用
     * @param ids
     */
    void updateStatus(int ids);

    /**
     * 分页查询
     * @param page  页数
     * @param pageSize  每页数量
     * @return
     */
    PageInfo pageUser(Integer page, Integer pageSize);

    /**
     * 更新用户的所管理的小区
     * @param user
     */
    void updateAeaId(User user);

    /**
     * 条件查询 根据用户或者注册名查询
     *
     * @param  user  用户名称或者注册名称
     * @return  用户集合
     */
    List<User> selecteByName(User user);

    /**
     * 根据所在部门和 用户名或注册名查询
     * @param user
     * @return
     */
    List<User> selectByCondition(User user);

    /**
     * 为用户授予角色
     * @param userID  用户id
     * @param roleId  角色id
     */
    void authorizationUser(Integer userID, Integer roleId);



}
