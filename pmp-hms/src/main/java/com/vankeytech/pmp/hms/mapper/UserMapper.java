package com.vankeytech.pmp.hms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.hms.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BasicMapper<User> {
    Integer selectCount();
}