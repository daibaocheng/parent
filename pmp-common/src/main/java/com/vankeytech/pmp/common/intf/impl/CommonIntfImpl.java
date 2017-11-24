package com.vankeytech.pmp.common.intf.impl;

import com.vankeytech.pmp.common.entity.Region;
import com.vankeytech.pmp.common.intf.CommonIntf;
import com.vankeytech.pmp.common.service.RegionService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class CommonIntfImpl implements CommonIntf {
    @Resource
    private RegionService regionService;

    @Override
    public List<Region> getProvinces() {
        return regionService.getProvinces();
    }

    @Override
    public List<Region> getCities(String parentId) {
        return regionService.getCities(parentId);
    }

    @Override
    public List<Region> getRegions(String ids) {
        return regionService.selectByIds(ids);
    }

}
