package com.vankeytech.pmp.hms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hms_village")
public class Village {
    /**
     * 小区编号
     */
    @Id
    @Column(name = "village_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long villageNo;

    /**
     * 小区名
     */
    @Column(name = "village_name")
    private String villageName;

    /**
     * 小区地址（省市区）
     */
    @Column(name = "region_code")
    private Long regionCode;

    /**
     * 物业管理公司
     */
    @Column(name = "property_management_company")
    private String propertyManagementCompany;

    /**
     * 物业公司联系方式
     */
    @Column(name = "Property_company_phone")
    private String propertyCompanyPhone;

    /**
     * 开发商
     */
    private String developers;

    /**
     * 建造时间
     */
    @Column(name = "construction_time")
    private Date constructionTime;

    /**
     * 小区负责人
     */
    @Column(name = "community_leader")
    private String communityLeader;

    /**
     * 开发商联系方式
     */
    @Column(name = "developer_phone")
    private String developerPhone;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取小区编号
     *
     * @return village_no - 小区编号
     */
    public Long getVillageNo() {
        return villageNo;
    }

    /**
     * 设置小区编号
     *
     * @param villageNo 小区编号
     */
    public void setVillageNo(Long villageNo) {
        this.villageNo = villageNo;
    }

    /**
     * 获取小区名
     *
     * @return village_name - 小区名
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * 设置小区名
     *
     * @param villageName 小区名
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    /**
     * 获取小区地址（省市区）
     *
     * @return village_address - 小区地址（省市区）
     */
    public Long getRegionCode() {
        return regionCode;
    }

    /**
     * 设置小区地址（省市区）
     *
     * @param regionCode 小区地址（省市区）
     */
    public void setRegionId(Long regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * 获取物业管理公司
     *
     * @return property_management_company - 物业管理公司
     */
    public String getPropertyManagementCompany() {
        return propertyManagementCompany;
    }

    /**
     * 设置物业管理公司
     *
     * @param propertyManagementCompany 物业管理公司
     */
    public void setPropertyManagementCompany(String propertyManagementCompany) {
        this.propertyManagementCompany = propertyManagementCompany;
    }

    /**
     * 获取物业公司联系方式
     *
     * @return Property_company_phone - 物业公司联系方式
     */
    public String getPropertyCompanyPhone() {
        return propertyCompanyPhone;
    }

    /**
     * 设置物业公司联系方式
     *
     * @param propertyCompanyPhone 物业公司联系方式
     */
    public void setPropertyCompanyPhone(String propertyCompanyPhone) {
        this.propertyCompanyPhone = propertyCompanyPhone;
    }

    /**
     * 获取开发商
     *
     * @return developers - 开发商
     */
    public String getDevelopers() {
        return developers;
    }

    /**
     * 设置开发商
     *
     * @param developers 开发商
     */
    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    /**
     * 获取建造时间
     *
     * @return construction_time - 建造时间
     */
    public Date getConstructionTime() {
        return constructionTime;
    }

    /**
     * 设置建造时间
     *
     * @param constructionTime 建造时间
     */
    public void setConstructionTime(Date constructionTime) {
        this.constructionTime = constructionTime;
    }

    /**
     * 获取小区负责人
     *
     * @return community_leader - 小区负责人
     */
    public String getCommunityLeader() {
        return communityLeader;
    }

    /**
     * 设置小区负责人
     *
     * @param communityLeader 小区负责人
     */
    public void setCommunityLeader(String communityLeader) {
        this.communityLeader = communityLeader;
    }

    /**
     * 获取开发商联系方式
     *
     * @return developer_phone - 开发商联系方式
     */
    public String getDeveloperPhone() {
        return developerPhone;
    }

    /**
     * 设置开发商联系方式
     *
     * @param developerPhone 开发商联系方式
     */
    public void setDeveloperPhone(String developerPhone) {
        this.developerPhone = developerPhone;
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