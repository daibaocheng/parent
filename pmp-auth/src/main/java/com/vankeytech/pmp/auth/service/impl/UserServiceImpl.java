package com.vankeytech.pmp.auth.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.auth.entity.Permission;
import com.vankeytech.pmp.auth.entity.Role;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.entity.UserRole;
import com.vankeytech.pmp.auth.mapper.PermissionMapper;
import com.vankeytech.pmp.auth.mapper.RoleMapper;
import com.vankeytech.pmp.auth.mapper.UserMapper;
import com.vankeytech.pmp.auth.mapper.UserRoleMapper;
import com.vankeytech.pmp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;


import java.util.List;

/**
 * @author xieliang
 */
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

    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 根据用户名或者登陆名查询用户信息
     * @param user 用户名或者登陆名
     * @return 用户集合
     */
    @Override
    public List<User> selectByName(User user) {
        Condition condition = new Condition(User.class);
        condition.and()
                .andEqualTo("userRegisterAccount",user.getUserRegisterAccount())
                .orEqualTo("nickname",user.getNickname());
       List<User> list= this.selectByCondition(condition);
        return list;
    }


    /**
     * 登录 根据登录名
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        return   userMapper.selectOne(user);
    }

    /**
     * 获取用户对应角色
     * @param userId 用户id
     * @return 该用户的角色集合
     */
    @Override
    public List<Role> getUserRoles(Integer userId) {
        List<Role> roles = roleMapper.getRoleByUserId(userId);
        return roles;
    }

    /**
     * 获取用户权限
     * @param roleIds 用户对应的角色id集合
     * @return 权限集合
     */
    @Override
    public List<Permission> getUserPermisstion(List<Integer> roleIds) {
        List<Permission> permissions = permissionMapper.getPermisstionByRoleIds(roleIds);
        return permissions;
    }

    /**
     * 为用户配角色
     * @param userRole
     */
    @Override
    public void authorizationUser(UserRole userRole) {
        Condition cd = new Condition(userRole.getClass());
        cd.and().andEqualTo("userId",userRole.getUserId());

        int count = userRoleMapper.selectCountByCondition(cd);
        if(count < 1){
            userRoleMapper.insert(userRole);
            System.out.println("新增对应");
        }else{
            Condition condition = new Condition(userRole.getClass());
            condition.and().andEqualTo("userId", userRole.getUserId());
            userRoleMapper.updateByCondition(userRole,condition);
            System.out.println("更新对应");
        }

    }

    /**
     * 分页查询
     * @param user
     * @return
     */
    @Override
    public PageInfo<User> selecePageByCondition(User user) {
        List<User> userLit=userMapper.selectAll();
        PageHelper.startPage(0,9);
        PageInfo<User> pageInfo=new PageInfo<User>(userLit);
        return pageInfo;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public List<User> loadByCondition(User user) {
        Condition condition = new Condition(user.getClass());
        condition.and().andEqualTo("departmentId",user.getDepartmentId())
                .andEqualTo("userRegisterAccount",user.getUserRegisterAccount())
                .orEqualTo("nickname",user.getNickname());
        List<User> userList = userMapper.selectByCondition(condition);
        return userList;
    }
}
