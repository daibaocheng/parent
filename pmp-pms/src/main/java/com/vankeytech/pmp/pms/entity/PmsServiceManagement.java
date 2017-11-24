package com.vankeytech.pmp.pms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * @author daibaocheng
 */
@Table(name = "pms_service_management")
public class PmsServiceManagement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 报修类型，水电煤气0，家电家具1，电梯2，门禁3，公告设施4，物业设备5，其他报修6
     */
    private Integer type;

    /**
     * 报修内容
     */
    private String content;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 当前房屋(房屋外键，多对一)
     */
    @Column(name = "housing_id")
    private Integer housingId;

    /**
     * 报修人(住户外键，多对一)
     */
    @Column(name = "householders_id")
    private Integer householdersId;

    /**
     * 创建人
     */
    private String founder;

    /**
     * 处理状态，已完成0，带接单1，已关闭2，待派单3，评价完成4，待完成5
     */
    @Column(name = "processing_state")
    private Integer processingState;

    /**
     * 图片
     */
    @Column(name = "picture_url")
    private String pictureUrl;

    /**
     * 维修时间
     */
    @Column(name = "maintenance_time")
    private Date maintenanceTime;

    /**
     * 维修类型
     */
    @Column(name = "maintenance_type")
    private Integer maintenanceType;

    /**
     * 维修费用
     */
    @Column(name = "maintenance_cost")
    private Double maintenanceCost;

    /**
     * 维修说明
     */
    @Column(name = "maintenance_instruction")
    private String maintenanceInstruction;

    /**
     * 维修人
     */
    @Column(name = "maintenance_man")
    private String maintenanceMan;



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
     * 获取报修类型，水电煤气0，家电家具1，电梯2，门禁3，公告设施4，物业设备5，其他报修6
     *
     * @return type - 报修类型，水电煤气0，家电家具1，电梯2，门禁3，公告设施4，物业设备5，其他报修6
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置报修类型，水电煤气0，家电家具1，电梯2，门禁3，公告设施4，物业设备5，其他报修6
     *
     * @param type 报修类型，水电煤气0，家电家具1，电梯2，门禁3，公告设施4，物业设备5，其他报修6
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取报修内容
     *
     * @return content - 报修内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置报修内容
     *
     * @param content 报修内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 获取报修人(住户外键，多对一)
     *
     * @return householders_id - 报修人(住户外键，多对一)
     */
    public Integer getHouseholdersId() {
        return householdersId;
    }

    /**
     * 设置报修人(住户外键，多对一)
     *
     * @param householdersId 报修人(住户外键，多对一)
     */
    public void setHouseholdersId(Integer householdersId) {
        this.householdersId = householdersId;
    }

    /**
     * 获取创建人
     *
     * @return founder - 创建人
     */
    public String getFounder() {
        return founder;
    }

    /**
     * 设置创建人
     *
     * @param founder 创建人
     */
    public void setFounder(String founder) {
        this.founder = founder;
    }

    /**
     * 获取处理状态，已完成0，带接单1，已关闭2，待派单3，评价完成4，待完成5
     *
     * @return processing_state - 处理状态，已完成0，带接单1，已关闭2，待派单3，评价完成4，待完成5
     */
    public Integer getProcessingState() {
        return processingState;
    }

    /**
     * 设置处理状态，已完成0，带接单1，已关闭2，待派单3，评价完成4，待完成5
     *
     * @param processingState 处理状态，已完成0，带接单1，已关闭2，待派单3，评价完成4，待完成5
     */
    public void setProcessingState(Integer processingState) {
        this.processingState = processingState;
    }

    /**
     * 获取图片
     *
     * @return picture - 图片
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 设置图片
     *
     * @param pictureUrl 图片
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    /**
     * 获取维修时间
     *
     * @return maintenance_time - 维修时间
     */
    public Date getMaintenanceTime() {
        return maintenanceTime;
    }

    /**
     * 设置维修时间
     *
     * @param maintenanceTime 维修时间
     */
    public void setMaintenanceTime(Date maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
    }

    /**
     * 获取维修类型
     *
     * @return maintenance_type - 维修类型
     */
    public Integer getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * 设置维修类型
     *
     * @param maintenanceType 维修类型
     */
    public void setMaintenanceType(Integer maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    /**
     * 获取维修费用
     *
     * @return maintenance_cost - 维修费用
     */
    public Double getMaintenanceCost() {
        return maintenanceCost;
    }

    /**
     * 设置维修费用
     *
     * @param maintenanceCost 维修费用
     */
    public void setMaintenanceCost(Double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    /**
     * 获取维修说明
     *
     * @return maintenance_instruction - 维修说明
     */
    public String getMaintenanceInstruction() {
        return maintenanceInstruction;
    }

    /**
     * 设置维修说明
     *
     * @param maintenanceInstruction 维修说明
     */
    public void setMaintenanceInstruction(String maintenanceInstruction) {
        this.maintenanceInstruction = maintenanceInstruction;
    }

    /**
     * 获取维修人
     *
     * @return maintenance_man - 维修人
     */
    public String getMaintenanceMan() {
        return maintenanceMan;
    }

    /**
     * 设置维修人
     *
     * @param maintenanceMan 维修人
     */
    public void setMaintenanceMan(String maintenanceMan) {
        this.maintenanceMan = maintenanceMan;
    }
}