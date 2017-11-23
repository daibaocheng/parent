package com.vankeytech.pmp.cms.intf.impl;

import com.vankeytech.pmp.cms.entity.ParkingRecord;
import com.vankeytech.pmp.cms.intf.ParkingRecordIntf;
import com.vankeytech.pmp.cms.service.ParkingRecordService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ParkingRecordIntfImpl implements ParkingRecordIntf {

    @Resource
    private ParkingRecordService parkingRecordService;

    @Override
    public void insertParkingRecord(ParkingRecord parkingRecord) {
        parkingRecordService.insertParkingRecord(parkingRecord);
    }

    @Override
    public void deleteParkingRecordById(Integer id) {
        parkingRecordService.deleteParkingRecordById(id);
    }

    @Override
    public void updateParkingRecord(ParkingRecord parkingRecord) {
        parkingRecordService.updateParkingRecord(parkingRecord);
    }

    @Override
    public ParkingRecord selectParkingRecordById(Integer id) {
        return parkingRecordService.selectParkingRecordById(id);
    }

    @Override
    public List<ParkingRecord> selectAllParkingRecord() {
        return parkingRecordService.selectAllParkingRecord();
    }

}
