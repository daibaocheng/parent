package com.vankeytech.pmp.cms.service.impl;

import com.vankeytech.pmp.cms.entity.ParkingGate;
import com.vankeytech.pmp.cms.mapper.ParkingGateMapper;
import com.vankeytech.pmp.cms.service.ParkingGateService;
import com.vankeytech.pmp.cms.service.ParkingRecordService;
import org.springframework.stereotype.Service;

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
    public void insertParkingGate(ParkingGate parkingGate) {

    }

    @Override
    public void hideParkingGate(Integer id) {

    }

    @Override
    public void deleteParkingGate(Integer id) {

    }

    @Override
    public void updateParkingGate(ParkingGate parkingGate) {

    }

    @Override
    public ParkingGate selectParkingGateById(Integer id) {
        return null;
    }

    @Override
    public List<ParkingGate> selectAllParkingGate() {
        return null;
    }

    @Override
    public List<ParkingGate> selectParkingGateByCommunityId(Integer communityId) {
        return null;
    }
}
