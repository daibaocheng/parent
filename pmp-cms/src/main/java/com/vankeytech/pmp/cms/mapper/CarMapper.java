package com.vankeytech.pmp.cms.mapper;

import com.vankeytech.pmp.cms.entity.Car;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CarMapper extends Mapper<Car> {
    /**
     * 新增一辆车
     *
     * @param car 车辆实体类
     */
    void insertCar(Car car);

    /**
     * 根据车辆ID删除车辆信息
     *
     * @param id 车辆ID
     */
    void deleteCarById(Integer id);

    /**
     * 修改车辆信息
     *
     * @param car 车辆实体类
     */
    void updateCar(Car car);

    /**
     * 根据车辆ID查询车辆信息
     *
     * @param id 车辆ID
     * @return 车辆实体类
     */
    List<Car> selectCarById(Integer id);

    /**
     * 查询所有车辆信息
     *
     * @return 车辆实体类组成的LIST集合
     */
    List<Car> selectAllCar();
}