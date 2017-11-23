package com.vankeytech.pmp.cms.intf.impl;

import com.vankeytech.pmp.cms.entity.ParkingLot;
import com.vankeytech.pmp.cms.intf.ParkingLotIntf;
import com.vankeytech.pmp.cms.service.ParkingLotService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ParkingLotIntfImpl implements ParkingLotIntf {

    @Resource
    private ParkingLotService parkingLotService;

    @Override
    public void insertParkingLot(ParkingLot parkingLot) {
        parkingLotService.insertParkingLot(parkingLot);
    }

    @Override
    public void deleteParkingLotById(Integer id) {
        parkingLotService.deleteParkingLotById(id);
    }

    @Override
    public void updateParkingLot(ParkingLot parkingLot) {
        parkingLotService.updateParkingLot(parkingLot);
    }

    @Override
    public ParkingLot selectParkingLotById(Integer id) {
        return parkingLotService.selectParkingLotById(id);
    }

    @Override
    public List<ParkingLot> selectAllParkingLot() {
        return parkingLotService.selectAllParkingLot();
    }

}
