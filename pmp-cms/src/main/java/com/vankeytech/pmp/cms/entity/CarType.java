package com.vankeytech.pmp.cms.entity;

import javax.persistence.*;

@Table(name = "cms_car_type")
public class CarType {
    /**
     * 车辆类型ID
     */
    @Id
    private Integer id;

    /**
     * 车辆类型名称
     */
    private String name;

    /**
     * 获取车辆类型ID
     *
     * @return id - 车辆类型ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置车辆类型ID
     *
     * @param id 车辆类型ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取车辆类型名称
     *
     * @return name - 车辆类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置车辆类型名称
     *
     * @param name 车辆类型名称
     */
    public void setName(String name) {
        this.name = name;
    }
}