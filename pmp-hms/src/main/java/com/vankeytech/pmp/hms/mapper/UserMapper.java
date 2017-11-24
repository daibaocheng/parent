package com.vankeytech.pmp.hms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.hms.condition.UserCondition;
import com.vankeytech.pmp.hms.entity.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserMapper extends BasicMapper<User> {

    List<User> selectAllUsers() ;

    List<User> selectUserByCondition(UserCondition userCondition) ;

    List<User> selectUserByIds(Integer[] ids);

    Integer selectUserCountByCondition(UserCondition userCondition) ;

    void insertUserOne(User user) ;

    void insertUsers(List<User> users) ;

    void updateUser(User user) ;

    void deleteUserByPrimaryKey(@Param("id") Integer id) ;

    void deleteUserByIds(Integer[] ids) ;
}