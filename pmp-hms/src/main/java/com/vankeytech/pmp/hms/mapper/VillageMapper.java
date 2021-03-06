package com.vankeytech.pmp.hms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.hms.condition.VillageCondition;
import com.vankeytech.pmp.hms.entity.Village;

import java.util.List;

public interface VillageMapper extends BasicMapper<Village> {

    List<Village> selectAllVillages() ;

    List<Village> selectVillageByCondition(VillageCondition villageCondition) ;

    Integer insertVillage(Village village) ;
}