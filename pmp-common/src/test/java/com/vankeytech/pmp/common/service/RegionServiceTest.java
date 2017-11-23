package com.vankeytech.pmp.common.service;

import com.vankeytech.pmp.common.entity.Region;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegionServiceTest {
    @Resource
    private RegionService regionService;

    private String parentId;

    @Before
    public void getProvinces() throws Exception {
        List<Region> provinces = regionService.getProvinces();
        assertTrue(provinces.size() > 0);
        parentId = provinces.get(0).getRegionCode();
    }

    @Test
    public void getCities() throws Exception {
        List<Region> provinces = regionService.getCities(parentId);
        assertTrue(provinces.size() > 0);
    }

}