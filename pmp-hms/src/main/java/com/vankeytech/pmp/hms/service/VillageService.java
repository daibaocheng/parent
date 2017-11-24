package com.vankeytech.pmp.hms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.hms.condition.VillageCondition;
import com.vankeytech.pmp.hms.entity.Village;

import java.util.List;

/**
 * @author Administrator
 */
public interface VillageService extends Service<Village> {

    List<Village> selectAllVillages() ;

    List<Village> selectVillageByCondition(VillageCondition villageCondition) ;

    Integer insertVillage(Village village) ;
}
