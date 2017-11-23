package com.vankeytech.pmp.hms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.hms.entity.Building;
import com.vankeytech.pmp.hms.mapper.BuildingMapper;
import com.vankeytech.pmp.hms.service.BuildingService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class BuildingServiceImpl extends BaseService<Building> implements BuildingService {

    public BuildingServiceImpl(BuildingMapper buildingMapper) {
        super(buildingMapper);
    }
}
