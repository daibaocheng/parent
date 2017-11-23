package com.vankeytech.pmp.cms.entity;

import javax.persistence.*;

@Table(name = "cms_car")
public class Car {
    /**
     * 车辆ID
     */
    @Id
    private Integer id;

    /**
     * 车牌ID
     */
    @Column(name = "license_plate_id")
    private String licensePlateId;

    /**
     * 车牌类型ID
     */
    @Column(name = "license_plate_type_id")
    private Integer licensePlateTypeId;

    /**
     * 车牌颜色ID
     */
    @Column(name = "license_plate_color_id")
    private Integer licensePlateColorId;

    /**
     * 车辆颜色ID
     */
    @Column(name = "color_id")
    private String colorId;

    /**
     * 停车类型ID
     */
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 是否显示（0为隐藏，1为显示）
     */
    private Integer show;

    /**
     * 获取车辆ID
     *
     * @return id - 车辆ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置车辆ID
     *
     * @param id 车辆ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取车牌ID
     *
     * @return license_plate_id - 车牌ID
     */
    public String getLicensePlateId() {
        return licensePlateId;
    }

    /**
     * 设置车牌ID
     *
     * @param licensePlateId 车牌ID
     */
    public void setLicensePlateId(String licensePlateId) {
        this.licensePlateId = licensePlateId;
    }

    /**
     * 获取车牌类型ID
     *
     * @return license_plate_type_id - 车牌类型ID
     */
    public Integer getLicensePlateTypeId() {
        return licensePlateTypeId;
    }

    /**
     * 设置车牌类型ID
     *
     * @param licensePlateTypeId 车牌类型ID
     */
    public void setLicensePlateTypeId(Integer licensePlateTypeId) {
        this.licensePlateTypeId = licensePlateTypeId;
    }

    /**
     * 获取车牌颜色ID
     *
     * @return license_plate_color_id - 车牌颜色ID
     */
    public Integer getLicensePlateColorId() {
        return licensePlateColorId;
    }

    /**
     * 设置车牌颜色ID
     *
     * @param licensePlateColorId 车牌颜色ID
     */
    public void setLicensePlateColorId(Integer licensePlateColorId) {
        this.licensePlateColorId = licensePlateColorId;
    }

    /**
     * 获取车辆颜色ID
     *
     * @return color_id - 车辆颜色ID
     */
    public String getColorId() {
        return colorId;
    }

    /**
     * 设置车辆颜色ID
     *
     * @param colorId 车辆颜色ID
     */
    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    /**
     * 获取停车类型ID
     *
     * @return type_id - 停车类型ID
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置停车类型ID
     *
     * @param typeId 停车类型ID
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取是否显示（0为隐藏，1为显示）
     *
     * @return show - 是否显示（0为隐藏，1为显示）
     */
    public Integer getShow() {
        return show;
    }

    /**
     * 设置是否显示（0为隐藏，1为显示）
     *
     * @param show 是否显示（0为隐藏，1为显示）
     */
    public void setShow(Integer show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", licensePlateId='" + licensePlateId + '\'' +
                ", licensePlateTypeId=" + licensePlateTypeId +
                ", licensePlateColorId=" + licensePlateColorId +
                ", colorId='" + colorId + '\'' +
                ", typeId=" + typeId +
                ", uid=" + uid +
                ", show=" + show +
                '}';
    }
}