package com.vankeytech.pmp.cms.entity;

import javax.persistence.*;

@Table(name = "cms_parking_lot")
public class ParkingLot {
    /**
     * 停车场ID
     */
    @Id
    private Integer id;

    /**
     * 停车场名称
     */
    private String name;

    /**
     * 停车场地址
     */
    private String address;

    /**
     * 车位数量
     */
    @Column(name = "number_of_parking_space")
    private Integer numberOfParkingSpace;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 小区ID
     */
    @Column(name = "community_id")
    private Integer communityId;

    /**
     * 获取停车场ID
     *
     * @return id - 停车场ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置停车场ID
     *
     * @param id 停车场ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取停车场名称
     *
     * @return name - 停车场名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置停车场名称
     *
     * @param name 停车场名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取停车场地址
     *
     * @return address - 停车场地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置停车场地址
     *
     * @param address 停车场地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取车位数量
     *
     * @return number_of_parking_space - 车位数量
     */
    public Integer getNumberOfParkingSpace() {
        return numberOfParkingSpace;
    }

    /**
     * 设置车位数量
     *
     * @param numberOfParkingSpace 车位数量
     */
    public void setNumberOfParkingSpace(Integer numberOfParkingSpace) {
        this.numberOfParkingSpace = numberOfParkingSpace;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取小区ID
     *
     * @return community_id - 小区ID
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     * 设置小区ID
     *
     * @param communityId 小区ID
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numberOfParkingSpace=" + numberOfParkingSpace +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", communityId=" + communityId +
                '}';
    }
}