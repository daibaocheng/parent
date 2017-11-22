package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.UserIntf;
import com.vankeytech.pmp.hms.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * @author Administrator
 */
@Component
public class UserIntfImpl implements UserIntf {

    @Resource
    private UserService userService;

    @Override
    public List<User> selectAll() {
        return userService.selectAll();
    }

    @Override
    public List<User> selectByCondition(tk.mybatis.mapper.entity.Condition condition) {
        return userService.selectByCondition(condition);
    }

    @Override
    public List<User> selectByIds(String ids) {
        return userService.selectByIds(ids);
    }

    @Override
    public Integer selectCount(User user) {
        return userService.selectCount(user);
    }

    @Override
    public Integer selectCountByCondition(tk.mybatis.mapper.entity.Condition condition) {
        return userService.selectCountByCondition(condition);
    }

    @Override
    public Integer insertUser(User user) {
        return userService.insertSelective(user);
    }

    @Override
    public Integer insertUsers(List<User> users) {
        return userService.insertList(users);
    }

    @Override
    public Integer updateUser(User user) {
        return userService.updateByPrimaryKeySelective(user);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return userService.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return userService.deleteByIds(ids);
    }
}
