package com.vankeytech.pmp.cms.service.impl;

import com.vankeytech.pmp.cms.entity.ParkingGate;
import com.vankeytech.pmp.cms.mapper.ParkingGateMapper;
import com.vankeytech.pmp.cms.service.ParkingGateService;
import com.vankeytech.pmp.cms.service.ParkingRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParkingGateServiceImpl implements ParkingGateService {

    @Resource
    private ParkingRecordService parkingRecordService;

    @Resource
    private ParkingGateMapper parkingGateMapper;

    @Override
    public void open(Integer parkingGateId) {

    }

    @Override
    public void close(Integer parkingGateId) {

    }

    @Override
    @Transactional
    public void insertParkingGate(ParkingGate parkingGate) {
        parkingGate.setHide(0);
        parkingGateMapper.insertParkingGate(parkingGate);
    }

    @Override
    @Transactional
    public void hideParkingGateById(Integer id) {
        ParkingGate parkingGate = new ParkingGate();
        parkingGate.setId(id);
        parkingGate.setHide(1);
        parkingGateMapper.updateParkingGate(parkingGate);
    }

    @Override
    @Transactional
    public void deleteParkingGateById(Integer id) {
        parkingGateMapper.deleteParkingGateById(id);
    }

    @Override
    @Transactional
    public void updateParkingGate(ParkingGate parkingGate) {
        parkingGateMapper.updateParkingGate(parkingGate);
    }

    @Override
    public ParkingGate selectParkingGateById(Integer id) {
        return parkingGateMapper.selectParkingGateById(id);
    }

    @Override
    public List<ParkingGate> selectAllParkingGate() {
        return parkingGateMapper.selectAllParkingGate();
    }

    @Override
    public List<ParkingGate> selectParkingGateByCommunityId(Integer communityId) {
        return parkingGateMapper.selectParkingGateByCommunityId(communityId);
    }
}
