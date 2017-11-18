package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.entity.User;

import java.util.List;
import java.util.concurrent.locks.Condition;

public interface SelectUserIntf {

    List<User> selectAll() ;

    List<User> selectByCondition(Condition condition) ;

    List<User> selectByIds(String ids);

    Integer selectCount();

    Integer selectCountByCondition(Condition condition) ;
}
