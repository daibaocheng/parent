package com.vankeytech.pmp.hms.intf;

public interface DeleteUserIntf {

    Integer deleteByPrimaryKey(Integer id) ;

    //有问题
    Integer deleteByIds(String ids) ;

}
