package com.vankeytech.pmp.hms.entity;

import javax.persistence.*;

@Table(name = "hms_user_building")
public class UserBuilding {
    /**
     * user_building_id
     */
    @Id
    @Column(name = "user_building_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userBuildingId;

    /**
     * user_id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * building_id
     */
    @Column(name = "building_id")
    private Long buildingId;

    /**
     * 获取user_building_id
     *
     * @return user_building_id - user_building_id
     */
    public Long getUserBuildingId() {
        return userBuildingId;
    }

    /**
     * 设置user_building_id
     *
     * @param userBuildingId user_building_id
     */
    public void setUserBuildingId(Long userBuildingId) {
        this.userBuildingId = userBuildingId;
    }

    /**
     * 获取user_id
     *
     * @return user_id - user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置user_id
     *
     * @param userId user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取building_id
     *
     * @return building_id - building_id
     */
    public Long getBuildingId() {
        return buildingId;
    }

    /**
     * 设置building_id
     *
     * @param buildingId building_id
     */
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }
}