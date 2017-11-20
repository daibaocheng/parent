package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.entity.Building;
import com.vankeytech.pmp.hms.intf.BuildingIntf;
import com.vankeytech.pmp.hms.service.BuildingService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Component
public class BuildingIntfImpl implements BuildingIntf {

    @Resource
    private BuildingService buildingService;
    @Override
    public List<Building> selectAll() {
        System.out.println("buildingService.selectAll() = " + buildingService.selectAll());
        return buildingService.selectAll();
    }
}
