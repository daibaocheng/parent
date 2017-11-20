package com.vankeytech.pmp.hms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.hms.entity.User;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserService extends Service<User> {

    void deleteByPrimaryKey(Integer id);
}
