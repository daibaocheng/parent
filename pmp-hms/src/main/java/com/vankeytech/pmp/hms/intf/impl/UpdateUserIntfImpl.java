package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.InsertUserIntf;
import com.vankeytech.pmp.hms.intf.UpdateUserIntf;
import com.vankeytech.pmp.hms.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Component
public class UpdateUserIntfImpl implements UpdateUserIntf {

    @Resource
    private UserService userService;

    @Override
    public Integer updateUser(User user) {
        return userService.updateByPrimaryKey(user);
    }
}
