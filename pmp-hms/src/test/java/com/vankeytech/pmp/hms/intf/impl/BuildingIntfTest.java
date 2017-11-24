package com.vankeytech.pmp.hms.intf.impl;

import com.vankeytech.pmp.hms.intf.BuildingIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuildingIntfTest {

    @Resource
    private BuildingIntf buildingIntf;

    @Test
    public void test() {
        System.out.println(buildingIntf.selectAll());
    }

}
