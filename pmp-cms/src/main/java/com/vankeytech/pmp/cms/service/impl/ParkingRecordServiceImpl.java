package com.vankeytech.pmp.cms.service.impl;

import com.vankeytech.pmp.cms.entity.ParkingRecord;
import com.vankeytech.pmp.cms.mapper.ParkingRecordMapper;
import com.vankeytech.pmp.cms.service.ParkingRecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParkingRecordServiceImpl implements ParkingRecordService {

    @Resource
    private ParkingRecordMapper parkingRecordMapper;

    @Override
    @Transactional
    public void insertParkingRecord(ParkingRecord parkingRecord) {
        parkingRecordMapper.insertParkingRecord(parkingRecord);
    }

    @Override
    @Transactional
    public void deleteParkingRecordById(Integer id) {
        parkingRecordMapper.deleteParkingRecordById(id);
    }

    @Override
    @Transactional
    public void updateParkingRecord(ParkingRecord parkingRecord) {
        parkingRecordMapper.updateParkingRecord(parkingRecord);
    }

    @Override
    public ParkingRecord selectParkingRecordById(Integer id) {
        return parkingRecordMapper.selectParkingRecordById(id);
    }

    @Override
    public List<ParkingRecord> selectAllParkingRecord() {
        return parkingRecordMapper.selectAllParkingRecord();
    }

}
