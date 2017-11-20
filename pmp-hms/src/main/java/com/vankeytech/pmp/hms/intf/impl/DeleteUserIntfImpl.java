package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.DeleteUserIntf;
import com.vankeytech.pmp.hms.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Component
public class DeleteUserIntfImpl implements DeleteUserIntf {

    @Resource
    private UserService userService;

    /**
     *  软删除
     * @author Administrator
     * @return
     */
    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return this.userService.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return this.userService.deleteByIds(ids);
    }

}
