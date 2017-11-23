package com.vankeytech.pmp.common.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.common.entity.Region;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionMapper extends BasicMapper<Region> {
    List<Region> getRegions(String parentId);
}