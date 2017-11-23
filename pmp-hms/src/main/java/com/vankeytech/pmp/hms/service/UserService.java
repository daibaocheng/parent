package com.vankeytech.pmp.hms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.hms.condition.SelectCondition;
import com.vankeytech.pmp.hms.entity.User;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserService extends Service<User> {

    List<User> selectAllUsers() ;

    List<User> selectUserByCondition(SelectCondition selectCondition) ;

    List<User> selectUserByIds(Integer[] ids);

    Integer selectUserCountByCondition(SelectCondition selectCondition) ;

    void insertUserOne(User user) ;

    void insertUsers(List<User> users) ;

    void updateUser(User user) ;

    void deleteUserByPrimaryKey(Integer id) ;

    void deleteUserByIds(Integer[] ids) ;
}
