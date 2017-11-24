package com.vankeytech.pmp.hms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.hms.condition.UserCondition;
import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.mapper.UserMapper;
import com.vankeytech.pmp.hms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.print.Doc;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Resource
    UserMapper userMapper;
    public UserServiceImpl(UserMapper userMapper) {
        super(userMapper);
    }

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public PageInfo<User> selectAllByPage(Integer currentPage,Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<User> users = userMapper.selectAllUsers();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    @Override
    public PageInfo<User> selectUserByCondition(UserCondition userCondition,Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<User> users = userMapper.selectUserByCondition(userCondition);
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }

    @Override
    public List<User> selectUserByIds(Integer[] ids) {
        return this.userMapper.selectUserByIds(ids);
    }

    @Override
    public Integer selectUserCountByCondition(UserCondition userCondition) {
        return this.userMapper.selectUserCountByCondition(userCondition);
    }

    @Override
    public void insertUserOne(User user) {
        this.userMapper.insertUserOne(user);
    }

    @Override
    public void insertUsers(List<User> users) {
        this.userMapper.insertUsers(users);
    }

    @Override
    public void updateUser(User user) {
        this.userMapper.updateUser(user);
    }

    @Override
    public void deleteUserByPrimaryKey(Integer id) {
        this.userMapper.deleteUserByPrimaryKey(id);
    }

    @Override
    public void deleteUserByIds(Integer[] ids) {
        this.userMapper.deleteUserByIds(ids);
    }
}
