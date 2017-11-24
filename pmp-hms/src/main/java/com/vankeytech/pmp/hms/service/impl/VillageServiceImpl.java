package com.vankeytech.pmp.hms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.hms.condition.VillageCondition;
import com.vankeytech.pmp.hms.entity.Village;
import com.vankeytech.pmp.hms.mapper.VillageMapper;
import com.vankeytech.pmp.hms.service.VillageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class VillageServiceImpl extends BaseService<Village> implements VillageService {

    @Resource
    private VillageMapper villageMapper;

    public VillageServiceImpl(VillageMapper villageMapper) {
        super(villageMapper);
    }

    @Override
    public List<Village> selectAllVillages() {
        return villageMapper.selectAllVillages();
    }

    @Override
    public List<Village> selectVillageByCondition(VillageCondition villageCondition) {
        return villageMapper.selectVillageByCondition(villageCondition);
    }

    @Override
    public Integer insertVillage(Village village) {
        return villageMapper.insertVillage(village);
    }
}
