package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.entity.User;

import java.util.List;
import java.util.concurrent.locks.Condition;

public interface InsertUserIntf {

    Integer insertUser(User user) ;

    //有问题
    Integer insertUsers(List<User> users) ;

}
