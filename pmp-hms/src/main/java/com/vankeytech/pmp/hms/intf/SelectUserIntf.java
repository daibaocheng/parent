package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.entity.HmsUser;

import java.util.List;
import java.util.concurrent.locks.Condition;

public interface SelectUserIntf {

    List<HmsUser> selectAll() ;

    List<HmsUser> selectByCondition(Condition condition) ;

    List<HmsUser> selectByIds(String ids);

//    Integer selectCount();

    Integer selectCountByCondition(Condition condition) ;
}
