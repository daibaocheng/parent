package com.vankeytech.pmp.hms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.mapper.UserMapper;
import com.vankeytech.pmp.hms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Resource
    UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper) {
        super(userMapper);
    }

}
