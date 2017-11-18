package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.SelectUserIntf;
import com.vankeytech.pmp.hms.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * @author Administrator
 */
@Component
public class SelectUserIntfImpl implements SelectUserIntf {

    @Resource
    private UserService userService;

    @Override
    public List<User> selectAll() {
        return this.userService.selectAll();
    }

    @Override
    public List<User> selectByCondition(Condition condition) {
        return this.userService.selectByCondition((tk.mybatis.mapper.entity.Condition) condition);
    }

    @Override
    public List<User> selectByIds(String ids) {
        return this.userService.selectByIds(ids);
    }

    @Override
    public Integer selectCount() {
        return this.userService.selectCount();
    }

    @Override
    public Integer selectCountByCondition(Condition condition) {
        return this.userService.selectCountByCondition((tk.mybatis.mapper.entity.Condition) condition);
    }

}
