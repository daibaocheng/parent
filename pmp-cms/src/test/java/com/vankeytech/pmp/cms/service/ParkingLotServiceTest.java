package com.vankeytech.pmp.cms.service;

import com.vankeytech.pmp.cms.entity.ParkingLot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingLotServiceTest {

    @Resource
    private ParkingLotService parkingLotService;

    @Test
    public void insertParkingLot() throws Exception {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Vankey停车场");
        parkingLot.setAddress("成都市高新西区天辰路88号");
        parkingLot.setNumberOfParkingSpace(1121);
        parkingLot.setLongitude("103.9731985331");
        parkingLot.setLatitude("30.7337852634");
        parkingLot.setCommunityId(1);
        parkingLotService.insertParkingLot(parkingLot);
    }

    @Test
    public void deleteParkingLotById() throws Exception {
    }

    @Test
    public void updateParkingLot() throws Exception {
    }

    @Test
    public void selectParkingLotById() throws Exception {
    }

    @Test
    public void selectAllParkingLot() throws Exception {
    }

}