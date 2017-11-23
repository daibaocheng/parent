package com.vankeytech.pmp.common.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.common.entity.Region;
import com.vankeytech.pmp.common.mapper.RegionMapper;
import com.vankeytech.pmp.common.service.RegionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class RegionServiceImpl extends BaseService<Region> implements RegionService {

    private static final String TOP_LEVEL_PROV = "0";

    private RegionMapper regionMapper;

    public RegionServiceImpl(RegionMapper regionMapper) {
        super(regionMapper);
        this.regionMapper = regionMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Region> getProvinces() {
        return regionMapper.getRegions(TOP_LEVEL_PROV);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Region> getCities(String parentId) {
        return regionMapper.getRegions(parentId);
    }
}
