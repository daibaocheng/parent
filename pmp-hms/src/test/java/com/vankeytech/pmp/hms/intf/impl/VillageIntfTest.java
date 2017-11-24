package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.condition.VillageCondition;
import com.vankeytech.pmp.hms.entity.Village;
import com.vankeytech.pmp.hms.intf.BuildingIntf;
import com.vankeytech.pmp.hms.intf.VillageIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VillageIntfTest {

    @Resource
    private VillageIntf villageIntf;

    @Test
    public void selectAllVillages() {
        System.out.println(villageIntf.selectAllVillages());
    }
    @Test
    public void selectByCondition() {
        VillageCondition villageCondition = new VillageCondition("110000",null);
        System.out.println(villageIntf.selectByCondition(villageCondition));
    }
    @Test
    public void insertVillage() {
//        (#{villageId},#{villageNo},#{villageName},#{address},#{regionCode},#{longitude},#{latitude})
        Village village = new Village();
        village.setVillageId(3L);
        village.setVillageNo("001");
        village.setVillageName("wankai");
        village.setAddress("chengdu");
        village.setRegionCode("110000");
        village.setLongitude(123456.456d);
        village.setLatitude(123456.123456d);

        System.out.println(villageIntf.insertVillage(village));
    }

}
