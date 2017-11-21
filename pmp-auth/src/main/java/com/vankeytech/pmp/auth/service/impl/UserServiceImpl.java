package com.vankeytech.pmp.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.javafx.property.adapter.ReadOnlyPropertyDescriptor;
import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.auth.entity.Permission;
import com.vankeytech.pmp.auth.entity.Role;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.entity.UserRole;
import com.vankeytech.pmp.auth.mapper.PermissionMapper;
import com.vankeytech.pmp.auth.mapper.RoleMapper;
import com.vankeytech.pmp.auth.mapper.UserMapper;
import com.vankeytech.pmp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * @author xieliang
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class UserServiceImpl extends BaseService<User> implements UserService {

    public UserServiceImpl(UserMapper userMapper) {
        super(userMapper);
    }

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 根据用户id 更新用户的所属小区
     *  0代表没有小区
     * @param user
     */
    @Override
    public void updateArea(User user) {
        userMapper.updateArea(user);
    }

    /**
     * 根据用户名或者登陆名查询用户信息
     *
     * @param user 用户名或者登陆名
     * @return 用户集合
     */
    @Override
    public List<User> selectByName(User user) {

        List<User> users=userMapper.selectByName(user);
        return users;
    }


    /**
     * 登录 根据登录名
     *
     * @param registerName
     * @return
     */
    @Override
    public User login(String registerName) {
        return userMapper.login(registerName);
    }

    /**
     * 获取用户对应角色
     *
     * @param userId 用户id
     * @return 该用户的角色集合
     */
    @Override
    public List<Role> getUserRoles(Integer userId) {
        List<Role> roles=roleMapper.getRoleByUserId(userId);
        return roles;
    }

    /**
     * 获取用户权限
     *
     * @param roleIds 用户对应的角色id集合
     * @return 权限集合
     */
    @Override
    public List<Permission> getUserPermisstion(List<Integer> roleIds) {
        List<Permission> permissions=permissionMapper.getPermisstionByRoleIds(roleIds);
        return permissions;
    }

    /**
     * 更新密码
     *
     * @param user
     */
    @Override
    public void updatePassword(User user) {
        userMapper.updatePassword(user);
    }

    /**
     * 根据id删除用户 软删
     *
     * @param  userId
     */
    @Override
    public void deleteByuserId(Integer userId) {
        userMapper.deleteByUserId(userId);
    }

    /**
     * 为用户配角色
     *
     * @param userRole
     */
    @Override
    public void authorizationUser(UserRole userRole) {

    }

    /**
     * 更新用户的状态 启用还是禁用 1启用 0禁用
     *
     * @param
     */
    @Override
    public void updateStatus(User user) {
        Condition condition = new Condition(User.class);
        basicMapper.updateByPrimaryKeySelective(user);
    }

    public UserServiceImpl(BasicMapper<User> basicMapper) {
        super(basicMapper);
    }

    /**
     * 查询并分页
     *
     * @return
     */
    @Override
    public PageInfo<User> selectPage() {
        PageHelper.startPage(1,2);
        List<User> userList=super.selectAll();
        PageInfo<User> pageInfo=new PageInfo<User>(userList);

        return pageInfo;
    }

    /**
     * 条件查询并分页返回
     *
     * @param user
     * @return
     */
    @Override
    public PageInfo<User> selectPageBycondition(User user) {


        return null;
    }


}
