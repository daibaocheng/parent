package com.vankeytech.pmp.pms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pms_complaints")
public class PmsComplaints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 投诉类型，环境0，安全1，秩序2，工作人员3，设备设施4，其他投诉5
     */
    private Integer type;

    /**
     * 投诉人(住户表外键，多对一)
     */
    @Column(name = "householders_id")
    private Integer householdersId;

    /**
     * 处理状态，待接单0，待完成1，待派单2，已完成3，评价完成4
     */
    private Integer status;

    /**
     * 投诉内容
     */
    @Column(name = "complaint_content")
    private String complaintContent;

    /**
     * 创建时间
     */
    @Column(name = "creation_time")
    private Date creationTime;

    /**
     * 创建人
     */
    @Column(name = "creation_person")
    private String creationPerson;

    /**
     * 受理时间
     */
    @Column(name = "acceptance_time")
    private Date acceptanceTime;

    /**
     * 投诉地点
     */
    @Column(name = "complaints_site")
    private String complaintsSite;

    /**
     * 当前房屋(房屋外键，多对一)
     */
    @Column(name = "housing_id")
    private Integer housingId;

    /**
     * 图片地址
     */
    @Column(name = "picture_url")
    private String pictureUrl;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取投诉类型，环境0，安全1，秩序2，工作人员3，设备设施4，其他投诉5
     *
     * @return type - 投诉类型，环境0，安全1，秩序2，工作人员3，设备设施4，其他投诉5
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置投诉类型，环境0，安全1，秩序2，工作人员3，设备设施4，其他投诉5
     *
     * @param type 投诉类型，环境0，安全1，秩序2，工作人员3，设备设施4，其他投诉5
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取投诉人(住户表外键，多对一)
     *
     * @return householders_id - 投诉人(住户表外键，多对一)
     */
    public Integer getHouseholdersId() {
        return householdersId;
    }

    /**
     * 设置投诉人(住户表外键，多对一)
     *
     * @param householdersId 投诉人(住户表外键，多对一)
     */
    public void setHouseholdersId(Integer householdersId) {
        this.householdersId = householdersId;
    }

    /**
     * 获取处理状态，待接单0，待完成1，待派单2，已完成3，评价完成4
     *
     * @return status - 处理状态，待接单0，待完成1，待派单2，已完成3，评价完成4
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置处理状态，待接单0，待完成1，待派单2，已完成3，评价完成4
     *
     * @param status 处理状态，待接单0，待完成1，待派单2，已完成3，评价完成4
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取投诉内容
     *
     * @return complaint_content - 投诉内容
     */
    public String getComplaintContent() {
        return complaintContent;
    }

    /**
     * 设置投诉内容
     *
     * @param complaintContent 投诉内容
     */
    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
    }

    /**
     * 获取创建时间
     *
     * @return creation_time - 创建时间
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置创建时间
     *
     * @param creationTime 创建时间
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取创建人
     *
     * @return creation_person - 创建人
     */
    public String getCreationPerson() {
        return creationPerson;
    }

    /**
     * 设置创建人
     *
     * @param creationPerson 创建人
     */
    public void setCreationPerson(String creationPerson) {
        this.creationPerson = creationPerson;
    }

    /**
     * 获取受理时间
     *
     * @return acceptance_time - 受理时间
     */
    public Date getAcceptanceTime() {
        return acceptanceTime;
    }

    /**
     * 设置受理时间
     *
     * @param acceptanceTime 受理时间
     */
    public void setAcceptanceTime(Date acceptanceTime) {
        this.acceptanceTime = acceptanceTime;
    }

    /**
     * 获取投诉地点
     *
     * @return complaints_site - 投诉地点
     */
    public String getComplaintsSite() {
        return complaintsSite;
    }

    /**
     * 设置投诉地点
     *
     * @param complaintsSite 投诉地点
     */
    public void setComplaintsSite(String complaintsSite) {
        this.complaintsSite = complaintsSite;
    }

    /**
     * 获取当前房屋(房屋外键，多对一)
     *
     * @return housing_id - 当前房屋(房屋外键，多对一)
     */
    public Integer getHousingId() {
        return housingId;
    }

    /**
     * 设置当前房屋(房屋外键，多对一)
     *
     * @param housingId 当前房屋(房屋外键，多对一)
     */
    public void setHousingId(Integer housingId) {
        this.housingId = housingId;
    }

    /**
     * 获取图片地址
     * @return
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 设置图片地址
     * @param pictureUrl
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}