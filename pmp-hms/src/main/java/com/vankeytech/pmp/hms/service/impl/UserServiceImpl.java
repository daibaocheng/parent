package com.vankeytech.pmp.hms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.hms.entity.HmsUser;
import com.vankeytech.pmp.hms.mapper.HmsUserMapper;
import com.vankeytech.pmp.hms.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl extends BaseService<HmsUser> implements UserService {

    public UserServiceImpl(HmsUserMapper hmsUserMapper) {
        super(hmsUserMapper);
    }

}
