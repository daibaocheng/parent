package com.vankeytech.pmp.cms.mapper;

import com.vankeytech.pmp.cms.entity.ParkingRecord;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ParkingRecordMapper extends Mapper<ParkingRecord> {

    /**
     * 新增一条停车记录
     *
     * @param parkingRecord 停车记录实体类
     */
    void insertParkingRecord(ParkingRecord parkingRecord);

    /**
     * 根据停车记录ID删除停车记录信息
     *
     * @param id 停车记录ID
     */
    void deleteParkingRecordById(Integer id);

    /**
     * 修改停车记录信息
     *
     * @param parkingRecord 停车记录实体类
     */
    void updateParkingRecord(ParkingRecord parkingRecord);

    /**
     * 根据停车记录ID查询停车记录信息
     *
     * @param id 停车记录ID
     * @return 停车记录实体类
     */
    ParkingRecord selectParkingRecordById(Integer id);

    /**
     * 查询所有停车记录信息
     *
     * @return 停车记录实体类组成的LIST集合
     */
    List<ParkingRecord> selectAllParkingRecord();
}