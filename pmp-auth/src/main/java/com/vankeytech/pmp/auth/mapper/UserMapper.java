package com.vankeytech.pmp.auth.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.auth.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xieliang
 */
@Repository
public interface UserMapper extends BasicMapper<User> {
    /**
     * 更新用户所在小区
     * @param user
     */
    void updateArea(User user);

    /**
     * 根据用户名或者注册名查询用户信息
     * @param user 用户名或者登陆名
     * @return 用户集合
     */
    List<User> selectByName(User user);



}