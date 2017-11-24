package com.vankeytech.pmp.hms.service;

import com.github.pagehelper.PageInfo;
import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.hms.condition.UserCondition;
import com.vankeytech.pmp.hms.entity.User;

import java.util.List;

/**
 * @author Administrator
 */
public interface UserService extends Service<User> {

    List<User> selectAllUsers() ;

    PageInfo<User> selectAllByPage(Integer currentPage, Integer pageSize) ;

    PageInfo<User> selectUserByCondition(UserCondition userCondition,Integer currentPage, Integer pageSize) ;

    List<User> selectUserByIds(Integer[] ids);

    Integer selectUserCountByCondition(UserCondition userCondition) ;

    void insertUserOne(User user) ;

    void insertUsers(List<User> users) ;

    void updateUser(User user) ;

    void deleteUserByPrimaryKey(Integer id) ;

    void deleteUserByIds(Integer[] ids) ;
}
