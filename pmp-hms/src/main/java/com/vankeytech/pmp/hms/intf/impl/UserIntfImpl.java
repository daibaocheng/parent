package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.condition.SelectCondition;
import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.UserIntf;
import com.vankeytech.pmp.hms.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Component
public class UserIntfImpl implements UserIntf {

    @Resource
    private UserService userService;

    @Override
    public List<User> selectAllUsers() {
        return userService.selectAllUsers();
    }

    @Override
    public List<User> selectByCondition(SelectCondition selectCondition) {
        return userService.selectUserByCondition(selectCondition);
    }

    @Override
    public List<User> selectByIds(Integer[] ids) {
        return userService.selectUserByIds(ids);
    }

    @Override
    public Integer selectCount(User user) {
        return userService.selectCount(user);
    }

    @Override
    public Integer selectCountByCondition(SelectCondition selectcondition) {
        return userService.selectUserCountByCondition(selectcondition);
    }

    @Override
    public void insertUser(User user) {
        userService.insertUserOne(user);
    }

    @Override
    public void insertUsers(List<User> users) {
        userService.insertUsers(users);
    }

    @Override
    public void updateUser(User user) {
        userService.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
        userService.deleteUserByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        userService.deleteUserByIds(ids);
    }
}
