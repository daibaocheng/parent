package com.vankeytech.pmp.cms.service;

import com.vankeytech.pmp.cms.entity.ParkingGate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingGateServiceTest {

    @Resource
    private ParkingGateService parkingGateService;

    @Test
    public void open() throws Exception {
    }

    @Test
    public void close() throws Exception {
    }

    @Test
    public void insertParkingGate() throws Exception {
        ParkingGate parkingGate = new ParkingGate();
        parkingGate.setSentryBoothId(1);
        parkingGate.setDirection(1);
        parkingGate.setHide(0);
        parkingGateService.insertParkingGate(parkingGate);
    }

    @Test
    public void hideParkingGateById() throws Exception {
        parkingGateService.hideParkingGateById(1);
    }

    @Test
    public void deleteParkingGateById() throws Exception {
        parkingGateService.deleteParkingGateById(1);
    }

    @Test
    public void updateParkingGate() throws Exception {
        ParkingGate parkingGate = new ParkingGate();
        parkingGate.setSentryBoothId(18);
        parkingGate.setDirection(0);
        parkingGate.setId(4);
        parkingGateService.updateParkingGate(parkingGate);
    }

    @Test
    public void selectParkingGateById() throws Exception {
        ParkingGate parkingGate = parkingGateService.selectParkingGateById(3);
        System.out.println(parkingGate);
    }

    @Test
    public void selectAllParkingGate() throws Exception {
        List<ParkingGate> parkingGateList = parkingGateService.selectAllParkingGate();
        System.out.println(parkingGateList);
    }

    @Test
    public void selectParkingGateByCommunityId() throws Exception {
        List<ParkingGate> parkingGateList = parkingGateService.selectParkingGateByCommunityId(1);
        System.out.println(parkingGateList);
    }

}