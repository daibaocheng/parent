package com.vankeytech.pmp.cms.service;

import com.vankeytech.pmp.cms.entity.ParkingGate;

import java.util.List;

public interface ParkingGateService {

    /**
     * 根据停车场门闸机ID打开停车场门闸机
     *
     * @param id 停车场门闸机ID
     */
    void open(Integer id);

    /**
     * 根据停车场门闸机ID关闭停车场门闸机
     *
     * @param id 停车场门闸机ID
     */
    void close(Integer id);

    /**
     * 新增一个停车场门闸机
     *
     * @param parkingGate 停车场门闸机实体类
     */
    void insertParkingGate(ParkingGate parkingGate);

    /**
     * 根据停车场门闸机ID隐藏门闸机
     *
     * @param id 停车场门闸机ID
     */
    void hideParkingGateById(Integer id);

    /**
     * 根据停车场门闸机ID删除门闸机
     *
     * @param id 停车场门闸机ID
     */
    void deleteParkingGateById(Integer id);

    /**
     * 修改停车场门闸机信息
     *
     * @param parkingGate 门闸机实体类
     */
    void updateParkingGate(ParkingGate parkingGate);

    /**
     * 根据停车场门闸机ID查询停车场门闸机
     *
     * @param id 停车场门闸机ID
     * @return 停车场门闸机实体类
     */
    ParkingGate selectParkingGateById(Integer id);

    /**
     * 查询所有的停车场门闸机
     *
     * @return 停车场门闸机实体类组成的LIST集合
     */
    List<ParkingGate> selectAllParkingGate();

    /**
     * 根据小区ID查询停车场门禁机
     *
     * @param communityId 小区ID
     * @return 停车场门闸机实体类组成的LIST集合
     */
    List<ParkingGate> selectParkingGateByCommunityId(Integer communityId);

}
