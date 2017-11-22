package com.vankeytech.pmp.hms.entity;

import javax.persistence.*;

@Table(name = "hms_user_building")
public class UserBuilding {
    /**
     * 用户房屋编号
     */
    @Id
    @Column(name = "user_building_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userBuildingId;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 房屋编号
     */
    @Column(name = "building_id")
    private Long buildingId;

    /**
     * 获取用户房屋编号
     *
     * @return user_building_id - 用户房屋编号
     */
    public Long getUserBuildingId() {
        return userBuildingId;
    }

    /**
     * 设置用户房屋编号
     *
     * @param userBuildingId 用户房屋编号
     */
    public void setUserBuildingId(Long userBuildingId) {
        this.userBuildingId = userBuildingId;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取房屋编号
     *
     * @return building_id - 房屋编号
     */
    public Long getBuildingId() {
        return buildingId;
    }

    /**
     * 设置房屋编号
     *
     * @param buildingId 房屋编号
     */
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }
}