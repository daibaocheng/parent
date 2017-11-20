package com.vankeytech.pmp.hms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.hms.entity.HmsBuilding;
import com.vankeytech.pmp.hms.mapper.HmsBuildingMapper;
import com.vankeytech.pmp.hms.service.BuildingService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class BuildingServiceImpl extends BaseService<HmsBuilding> implements BuildingService {

    public BuildingServiceImpl(HmsBuildingMapper hmsBuildingMapper) {
        super(hmsBuildingMapper);
    }
}
