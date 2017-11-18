package com.vankeytech.pmp.auth.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.auth.entity.User;
import com.vankeytech.pmp.auth.mapper.UserMapper;
import com.vankeytech.pmp.auth.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl extends BaseService<User> implements UserService {
    public UserServiceImpl(UserMapper userMapper) {
        super(userMapper);
    }
}
