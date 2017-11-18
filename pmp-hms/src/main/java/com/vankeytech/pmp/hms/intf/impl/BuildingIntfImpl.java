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
        return buildingService.selectAll();
    }
}
