package com.vankeytech.pmp.cms.intf;

import com.vankeytech.pmp.cms.entity.ParkingLot;

import java.util.List;

public interface ParkingLotIntf {

    /**
     * 新增一个停车场
     *
     * @param parkingLot 停车场实体类
     */
    void insertParkingLot(ParkingLot parkingLot);

    /**
     * 根据停车场ID删除停车场
     *
     * @param id 停车场ID
     */
    void deleteParkingLotById(Integer id);

    /**
     * 修改停车场信息
     *
     * @param parkingLot 停车场实体类（包含主键ID）
     */
    void updateParkingLot(ParkingLot parkingLot);

    /**
     * 根据停车场ID查询该停车场
     *
     * @param id 停车场ID
     * @return 停车场实体类
     */
    ParkingLot selectParkingLotById(Integer id);

    /**
     * 查询所有的停车场
     *
     * @return 停车场实体类组成的LIST集合
     */
    List<ParkingLot> selectAllParkingLot();

}
