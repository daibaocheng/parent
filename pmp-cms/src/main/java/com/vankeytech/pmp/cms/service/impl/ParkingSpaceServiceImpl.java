package com.vankeytech.pmp.cms.service.impl;

import com.vankeytech.pmp.cms.entity.ParkingSpace;
import com.vankeytech.pmp.cms.mapper.ParkingSpaceMapper;
import com.vankeytech.pmp.cms.service.ParkingSpaceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParkingSpaceServiceImpl implements ParkingSpaceService {

    @Resource
    private ParkingSpaceMapper parkingSpaceMapper;

    @Override
    @Transactional
    public void insertParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaceMapper.insertParkingSpace(parkingSpace);
    }

    @Override
    @Transactional
    public void deleteParkingSpaceById(Integer id) {
        parkingSpaceMapper.deleteParkingSpaceById(id);
    }

    @Override
    @Transactional
    public void updateParkingSpace(ParkingSpace parkingSpace) {
        parkingSpaceMapper.updateParkingSpace(parkingSpace);
    }

    @Override
    public ParkingSpace selectParkingSpaceById(Integer id) {
        return parkingSpaceMapper.selectParkingSpaceById(id);
    }

    @Override
    public List<ParkingSpace> selectAllParkingSpace() {
        return parkingSpaceMapper.selectAllParkingSpace();
    }

    @Override
    public List<ParkingSpace> selectParkingSpaceByParkingLotId(Integer parkingLotId) {
        return parkingSpaceMapper.selectParkingSpaceByParkingLotId(parkingLotId);
    }

}
