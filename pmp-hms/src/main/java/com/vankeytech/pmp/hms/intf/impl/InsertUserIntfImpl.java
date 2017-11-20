package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.InsertUserIntf;
import com.vankeytech.pmp.hms.intf.SelectUserIntf;
import com.vankeytech.pmp.hms.service.UserService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * @author Administrator
 */
@Component
public class InsertUserIntfImpl implements InsertUserIntf {

    @Resource
    private UserService userService;

    @Override
    public Integer insertUser(User user) {
        return this.userService.insert(user);
    }

    @Override
    public Integer insertUsers(List<User> users) {
       return  userService.insertList(users);
    }

}
