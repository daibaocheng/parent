package com.vankeytech.pmp.hms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.mapper.UserMapper;
import com.vankeytech.pmp.hms.service.BuildingService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class BuildingServiceImpl extends BaseService<User> implements BuildingService {

    public BuildingServiceImpl(UserMapper userMapper) {
        super(userMapper);
    }
}
