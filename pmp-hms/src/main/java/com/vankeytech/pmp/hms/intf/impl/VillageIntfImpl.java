package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.condition.VillageCondition;
import com.vankeytech.pmp.hms.entity.Building;
import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.entity.Village;
import com.vankeytech.pmp.hms.intf.BuildingIntf;
import com.vankeytech.pmp.hms.intf.VillageIntf;
import com.vankeytech.pmp.hms.service.BuildingService;
import com.vankeytech.pmp.hms.service.VillageService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Component
public class VillageIntfImpl implements VillageIntf {

    @Resource
    private VillageService villageService;

    @Override
    public List<Village> selectAllVillages() {
        return villageService.selectAllVillages();
    }

    @Override
    public List<Village> selectByCondition(VillageCondition villageCondition) {
        return villageService.selectVillageByCondition(villageCondition);
    }

    @Override
    public Integer insertVillage(Village village) {
        return villageService.insertVillage(village);
    }
}
