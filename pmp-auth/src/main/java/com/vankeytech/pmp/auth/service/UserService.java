package com.vankeytech.pmp.auth.service;


import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.auth.entity.User;

import java.util.List;

/**
 * @author xieliang
 */
public interface UserService extends Service<User> {

    /**
     * 根据用户id 更新用户的所属小区
     * @param user
     */
    void updateArea(User user);

    /**
     * 根据用户名或者登陆名查询用户信息
     * @param  user 用户名或者登陆名
     * @return 用户集合
     */
    List<User> selectByName(User user);

}
