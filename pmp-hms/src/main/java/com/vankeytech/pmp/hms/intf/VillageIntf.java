package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.condition.VillageCondition;
import com.vankeytech.pmp.hms.entity.Village;

import java.util.List;


public interface VillageIntf {

    /**
     * 查询所有小区
     * @return
     */
    List<Village> selectAllVillages() ;

    /**
     * 通过条件查询小区（地区位置编号、小区名）
     * @param villageCondition
     * @return
     */
    List<Village> selectByCondition(VillageCondition villageCondition) ;

    /**
     * 增加小区
     * @param village
     */
    Integer insertVillage(Village village) ;

}
