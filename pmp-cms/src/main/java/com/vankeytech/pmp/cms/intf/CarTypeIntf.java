package com.vankeytech.pmp.cms.intf;

import com.vankeytech.pmp.cms.entity.CarType;

import java.util.List;

public interface CarTypeIntf {

    /**
     * 根据车辆类型ID查询车辆类型
     *
     * @param id 车辆类型ID
     * @return 车辆类型实体类
     */
    CarType selectCarTypeById(Integer id);

    /**
     * 查询所有的车辆类型
     *
     * @return 车辆类型实体类组成的LIST集合
     */
    List<CarType> selectAllCarType();

}
