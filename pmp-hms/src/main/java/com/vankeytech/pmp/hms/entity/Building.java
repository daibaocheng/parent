package com.vankeytech.pmp.hms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hms_building")
public class Building {
    /**
     * 房屋编号
     */
    @Id
    @Column(name = "building_id")
    private Long buildingId;

    /**
     * 楼栋号
     */
    @Column(name = "building_no")
    private Long buildingNo;

    /**
     * 单元号
     */
    @Column(name = "unit_no")
    private Long unitNo;

    /**
     * 房间号
     */
    @Column(name = "room_no")
    private Long roomNo;

    /**
     * 房屋类型（0高层、1多层、2联排、3独栋、4商业、5其他）
     */
    @Column(name = "house_type")
    private Long houseType;

    /**
     * 房屋面积
     */
    @Column(name = "floor_space")
    private Double floorSpace;

    /**
     * 房屋用途（0自住、1放租、2商用、3空置、4其他）
     */
    @Column(name = "house_purpose")
    private Long housePurpose;

    /**
     * 租金/每月（业主为0）
     */
    private Long rent;

    /**
     * 入住人数
     */
    @Column(name = "family_size")
    private Long familySize;

    /**
     * 房产拥有者
     */
    private Long owner;

    /**
     * 启用状态（是否）
     */
    @Column(name = "use_status")
    private Long useStatus;

    /**
     * 认证状态
     */
    @Column(name = "authority_status")
    private Long authorityStatus;

    /**
     * 创建时间
     */
    @Column(name = "creat_time")
    private Date creatTime;

    /**
     * 小区编号
     */
    private Long village;

    /**
     * 备注
     */
    private String remarks;

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

    /**
     * 获取楼栋号
     *
     * @return building_no - 楼栋号
     */
    public Long getBuildingNo() {
        return buildingNo;
    }

    /**
     * 设置楼栋号
     *
     * @param buildingNo 楼栋号
     */
    public void setBuildingNo(Long buildingNo) {
        this.buildingNo = buildingNo;
    }

    /**
     * 获取单元号
     *
     * @return unit_no - 单元号
     */
    public Long getUnitNo() {
        return unitNo;
    }

    /**
     * 设置单元号
     *
     * @param unitNo 单元号
     */
    public void setUnitNo(Long unitNo) {
        this.unitNo = unitNo;
    }

    /**
     * 获取房间号
     *
     * @return room_no - 房间号
     */
    public Long getRoomNo() {
        return roomNo;
    }

    /**
     * 设置房间号
     *
     * @param roomNo 房间号
     */
    public void setRoomNo(Long roomNo) {
        this.roomNo = roomNo;
    }

    /**
     * 获取房屋类型（0高层、1多层、2联排、3独栋、4商业、5其他）
     *
     * @return house_type - 房屋类型（0高层、1多层、2联排、3独栋、4商业、5其他）
     */
    public Long getHouseType() {
        return houseType;
    }

    /**
     * 设置房屋类型（0高层、1多层、2联排、3独栋、4商业、5其他）
     *
     * @param houseType 房屋类型（0高层、1多层、2联排、3独栋、4商业、5其他）
     */
    public void setHouseType(Long houseType) {
        this.houseType = houseType;
    }

    /**
     * 获取房屋面积
     *
     * @return floor_space - 房屋面积
     */
    public Double getFloorSpace() {
        return floorSpace;
    }

    /**
     * 设置房屋面积
     *
     * @param floorSpace 房屋面积
     */
    public void setFloorSpace(Double floorSpace) {
        this.floorSpace = floorSpace;
    }

    /**
     * 获取房屋用途（0自住、1放租、2商用、3空置、4其他）
     *
     * @return house_purpose - 房屋用途（0自住、1放租、2商用、3空置、4其他）
     */
    public Long getHousePurpose() {
        return housePurpose;
    }

    /**
     * 设置房屋用途（0自住、1放租、2商用、3空置、4其他）
     *
     * @param housePurpose 房屋用途（0自住、1放租、2商用、3空置、4其他）
     */
    public void setHousePurpose(Long housePurpose) {
        this.housePurpose = housePurpose;
    }

    /**
     * 获取租金/每月（业主为0）
     *
     * @return rent - 租金/每月（业主为0）
     */
    public Long getRent() {
        return rent;
    }

    /**
     * 设置租金/每月（业主为0）
     *
     * @param rent 租金/每月（业主为0）
     */
    public void setRent(Long rent) {
        this.rent = rent;
    }

    /**
     * 获取入住人数
     *
     * @return family_size - 入住人数
     */
    public Long getFamilySize() {
        return familySize;
    }

    /**
     * 设置入住人数
     *
     * @param familySize 入住人数
     */
    public void setFamilySize(Long familySize) {
        this.familySize = familySize;
    }

    /**
     * 获取房产拥有者
     *
     * @return owner - 房产拥有者
     */
    public Long getOwner() {
        return owner;
    }

    /**
     * 设置房产拥有者
     *
     * @param owner 房产拥有者
     */
    public void setOwner(Long owner) {
        this.owner = owner;
    }

    /**
     * 获取启用状态（是否）
     *
     * @return use_status - 启用状态（是否）
     */
    public Long getUseStatus() {
        return useStatus;
    }

    /**
     * 设置启用状态（是否）
     *
     * @param useStatus 启用状态（是否）
     */
    public void setUseStatus(Long useStatus) {
        this.useStatus = useStatus;
    }

    /**
     * 获取认证状态
     *
     * @return authority_status - 认证状态
     */
    public Long getAuthorityStatus() {
        return authorityStatus;
    }

    /**
     * 设置认证状态
     *
     * @param authorityStatus 认证状态
     */
    public void setAuthorityStatus(Long authorityStatus) {
        this.authorityStatus = authorityStatus;
    }

    /**
     * 获取创建时间
     *
     * @return creat_time - 创建时间
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置创建时间
     *
     * @param creatTime 创建时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * 获取小区编号
     *
     * @return village - 小区编号
     */
    public Long getVillage() {
        return village;
    }

    /**
     * 设置小区编号
     *
     * @param village 小区编号
     */
    public void setVillage(Long village) {
        this.village = village;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}