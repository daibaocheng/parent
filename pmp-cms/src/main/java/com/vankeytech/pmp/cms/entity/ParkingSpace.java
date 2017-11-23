package com.vankeytech.pmp.cms.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "cms_parking_space")
public class ParkingSpace implements Serializable {
    /**
     * 车位ID
     */
    @Id
    private Integer id;

    /**
     * 车位代号
     */
    private String alias;

    /**
     * 停车场ID
     */
    @Column(name = "parking_lot_id")
    private Integer parkingLotId;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 过期时间
     */
    @Column(name = "expired_time")
    private Date expiredTime;

    /**
     * 获取车位ID
     *
     * @return id - 车位ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置车位ID
     *
     * @param id 车位ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取车位代号
     *
     * @return alias - 车位代号
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置车位代号
     *
     * @param alias 车位代号
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取停车场ID
     *
     * @return parking_lot_id - 停车场ID
     */
    public Integer getParkingLotId() {
        return parkingLotId;
    }

    /**
     * 设置停车场ID
     *
     * @param parkingLotId 停车场ID
     */
    public void setParkingLotId(Integer parkingLotId) {
        this.parkingLotId = parkingLotId;
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
     * 获取过期时间
     *
     * @return expired_time - 过期时间
     */
    public Date getExpiredTime() {
        return expiredTime;
    }

    /**
     * 设置过期时间
     *
     * @param expiredTime 过期时间
     */
    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }
}