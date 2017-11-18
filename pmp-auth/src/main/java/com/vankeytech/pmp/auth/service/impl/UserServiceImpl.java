package com.vankeytech.pmp.auth.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.mapper.UserMapper;
import com.vankeytech.pmp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    /**
     * 根据用户id 更新用户的所属小区
     *  0代表没有小区
     * @param user
     */
    @Transactional(rollbackFor = Exception.class)
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

        System.out.println(user.getUserRegisterAccount()+user.getNickname()+"---------------------------------");
        List<User> users=userMapper.selectByName(user);
        return users;
    }
}
