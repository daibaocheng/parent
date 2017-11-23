package com.vankeytech.pmp.common.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.common.entity.Region;

import java.util.List;

public interface RegionService extends Service<Region> {
    List<Region> getProvinces();
    List<Region> getCities(String parentId);
}
