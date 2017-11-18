package com.vankeytech.pmp.cms.service.impl;

import com.vankeytech.pmp.cms.entity.ParkingLot;
import com.vankeytech.pmp.cms.mapper.ParkingLotMapper;
import com.vankeytech.pmp.cms.service.ParkingLotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParkingLotServiceImpl.class);

    @Resource
    private ParkingLotMapper parkingLotMapper;

    @Override
    @Transactional
    public void insertParkingLot(ParkingLot parkingLot) {
        parkingLotMapper.insertParkingLot(parkingLot);
    }

    @Override
    @Transactional
    public void deleteParkingLotById(Integer id) {
        parkingLotMapper.deleteParkingLotById(id);
    }

    @Override
    @Transactional
    public void updateParkingLot(ParkingLot parkingLot) {
        parkingLotMapper.updateParkingLot(parkingLot);
    }

    @Override
    public ParkingLot selectParkingLotById(Integer id) {
        List<ParkingLot> parkingLotList = parkingLotMapper.selectParkingLotById(id);
        if (parkingLotList.size() == 0) {
            return null;
        } else if (parkingLotList.size() != 1) {
            throw new RuntimeException();
        } else {
            return parkingLotList.get(0);
        }
    }

    @Override
    public List<ParkingLot> selectAllParkingLot() {
        return parkingLotMapper.selectAllParkingLot();
    }

}
