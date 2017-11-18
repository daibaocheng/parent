package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.BuildingIntf;
import com.vankeytech.pmp.hms.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 */
@Component
public class BuildingIntfImpl implements BuildingIntf {

    @Autowired
    private BuildingService buildingService;

    @Override
    public List<User> selectAll() {
        return this.buildingService.selectAll();
    }

    @Override
    public void add() {
        User user = new User();
        user.setId((short) 4);
        user.setUsername("xxx");
        user.setPid((short) 3);
        System.out.println("user = " + user);
        this.buildingService.insertSelective(user);
    }

    @Override
    public void update() {
        User user = new User();
        user.setId((short) 4);
        user.setUsername("1111");
        user.setPid((short) 1);
        buildingService.updateByPrimaryKey(user);
    }

    @Override
    public void delete() {
        String str = "[{id:4}]";
        this.buildingService.deleteByIds(str);
    }
}
