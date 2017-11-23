package com.vankeytech.pmp.cms.intf.impl;

import com.vankeytech.pmp.cms.entity.ParkingSpace;
import com.vankeytech.pmp.cms.intf.ParkingSpaceIntf;
import com.vankeytech.pmp.cms.service.ParkingSpaceService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ParkingSpaceIntfImpl implements ParkingSpaceIntf {

    @Resource
    private ParkingSpaceService parkingSpaceService;

    @Override
    public void insertParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaceService.insertParkingSpace(parkingSpace);
    }

    @Override
    public void deleteParkingSpaceById(Integer id) {
        parkingSpaceService.deleteParkingSpaceById(id);
    }

    @Override
    public void updateParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaceService.updateParkingSpace(parkingSpace);
    }

    @Override
    public ParkingSpace selectParkingSpaceById(Integer id) {
        return parkingSpaceService.selectParkingSpaceById(id);
    }

    @Override
    public List<ParkingSpace> selectAllParkingSpace() {
        return parkingSpaceService.selectAllParkingSpace();
    }

    @Override
    public List<ParkingSpace> selectParkingSpaceByParkingLotId(Integer parkingLotId) {
        return parkingSpaceService.selectParkingSpaceByParkingLotId(parkingLotId);
    }

}
