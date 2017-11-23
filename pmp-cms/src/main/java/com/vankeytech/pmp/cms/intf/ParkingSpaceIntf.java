package com.vankeytech.pmp.cms.intf;

import com.vankeytech.pmp.cms.entity.ParkingSpace;

import java.util.List;

public interface ParkingSpaceIntf {

    /**
     * 新增一个车位
     *
     * @param parkingSpace 车位实体类
     */
    void insertParkingSpace(ParkingSpace parkingSpace);

    /**
     * 根据车位ID删除车位
     *
     * @param id 车位ID
     */
    void deleteParkingSpaceById(Integer id);

    /**
     * 修改车位信息
     *
     * @param parkingSpace 车位实体类
     */
    void updateParkingSpace(ParkingSpace parkingSpace);

    /**
     * 根据车位ID查询车位
     *
     * @param id 车位ID
     * @return 车位实体类
     */
    ParkingSpace selectParkingSpaceById(Integer id);

    /**
     * 查询所有车位
     *
     * @return 车位实体类组成的LIST集合
     */
    List<ParkingSpace> selectAllParkingSpace();

    /**
     * 根据停车场ID查询车位
     * @param parkingLotId 停车场ID
     * @return 车位组成的LIST集合
     */
    List<ParkingSpace> selectParkingSpaceByParkingLotId(Integer parkingLotId);

}
