package com.vankeytech.pmp.hms.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "hms_user_building")
public class HouseAuthority {
    /**
     * 房屋认证编号
     */
    @Id
    @Column(name = "hous_authority_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long housAuthorityNo;

    /**
     * 房屋编号
     */
    @Column(name = "building_no")
    private Long buildingNo;

    /**
     * 住户编号
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 房产证编号
     */
    @Column(name = "house_proprietary_certificate")
    private String houseProprietaryCertificate;

    /**
     * 创建时间
     */
    @Column(name = "creat_time")
    private Date creatTime;

    /**
     * 到期时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 认证状态（0认证失败、1未认证、2认证中、3认证成功、4已注销、5已过期）
     */
    @Column(name = "authority_status")
    private Long authorityStatus;

    /**
     * 备注
     */
    @Column(name = "remarks")
    private String remarks;

    public Long getHousAuthorityNo() {
        return housAuthorityNo;
    }

    public void setHousAuthorityNo(Long housAuthorityNo) {
        this.housAuthorityNo = housAuthorityNo;
    }

    public Long getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(Long buildingNo) {
        this.buildingNo = buildingNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHouseProprietaryCertificate() {
        return houseProprietaryCertificate;
    }

    public void setHouseProprietaryCertificate(String houseProprietaryCertificate) {
        this.houseProprietaryCertificate = houseProprietaryCertificate;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getAuthorityStatus() {
        return authorityStatus;
    }

    public void setAuthorityStatus(Long authorityStatus) {
        this.authorityStatus = authorityStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "HouseAuthority{" +
                "housAuthorityNo=" + housAuthorityNo +
                ", buildingNo=" + buildingNo +
                ", userId=" + userId +
                ", houseProprietaryCertificate='" + houseProprietaryCertificate + '\'' +
                ", creatTime=" + creatTime +
                ", endTime=" + endTime +
                ", authorityStatus=" + authorityStatus +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}