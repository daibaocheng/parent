package com.vankeytech.pmp.hms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.hms.condition.SelectCondition;
import com.vankeytech.pmp.hms.entity.User;

import java.util.List;

public interface UserMapper extends BasicMapper<User> {

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