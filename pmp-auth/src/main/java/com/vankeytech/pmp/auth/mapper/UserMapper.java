package com.vankeytech.pmp.auth.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.entity.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xieliang
 */
@Repository
public interface UserMapper extends BasicMapper<User> {
    /**
     * 更新用户所在小区
     * @param user
     */
    void updateArea(User user);

    /**
     * 根据用户名或者注册名查询用户信息
     * @param user 用户名或者登陆名
     * @return 用户集合
     */
    List<User> selectByName(User user);

    /**
     * 登录
     * @param userRegisterName 登录名
     * @return 用户
     */
    User login(String userRegisterName);

    /**
     * 用户注册时判断 根据登录名是否已经重复
     * @param reginsterName  注册名
     * @return
     */
    User isRegister(String reginsterName);

    /**
     * 更新用户密码
     * @param user 用户对象
     */
    void updatePassword(User user);

    /**
     * 根据id删除用户信息
     * @param userId
     */
    void deleteByUserId(Integer userId);

    /**
     * 为用户分配角色
     * @param userRole
     */
    void authorizationUser(UserRole userRole);

    /**
     * 设置用于的状态
     * @param user
     */
    void updateStatus(User user);

}