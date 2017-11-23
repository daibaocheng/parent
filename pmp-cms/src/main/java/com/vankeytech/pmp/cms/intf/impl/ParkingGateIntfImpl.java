package com.vankeytech.pmp.cms.intf.impl;

import com.vankeytech.pmp.cms.entity.ParkingGate;
import com.vankeytech.pmp.cms.intf.ParkingGateIntf;
import com.vankeytech.pmp.cms.service.ParkingGateService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ParkingGateIntfImpl implements ParkingGateIntf {

    @Resource
    private ParkingGateService parkingGateService;

    @Override
    public void open(Integer id) {
        parkingGateService.open(id);
    }

    @Override
    public void close(Integer id) {
        parkingGateService.close(id);
    }

    @Override
    public void insertParkingGate(ParkingGate parkingGate) {
        parkingGateService.insertParkingGate(parkingGate);
    }

    @Override
    public void hideParkingGateById(Integer id) {
        parkingGateService.hideParkingGateById(id);
    }

    @Override
    public void deleteParkingGateById(Integer id) {
        parkingGateService.deleteParkingGateById(id);
    }

    @Override
    public void updateParkingGate(ParkingGate parkingGate) {
        parkingGateService.updateParkingGate(parkingGate);
    }

    @Override
    public ParkingGate selectParkingGateById(Integer id) {
        return parkingGateService.selectParkingGateById(id);
    }

    @Override
    public List<ParkingGate> selectAllParkingGate() {
        return parkingGateService.selectAllParkingGate();
    }

    @Override
    public List<ParkingGate> selectParkingGateByCommunityId(Integer communityId) {
        return parkingGateService.selectParkingGateByCommunityId(communityId);
    }

}
