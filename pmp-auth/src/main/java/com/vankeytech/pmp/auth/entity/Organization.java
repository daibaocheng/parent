package com.vankeytech.pmp.auth.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author  xieliang
 */
@Table(name = "auth_organization")
public class Organization implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "organization_id")
    private Long organizationId;

    /**
     * 组织名称
     */
    @Column(name = "organization_name")
    private String organizationName;

    /**
     * 组织类型
     */
    @Column(name = "organization_type")
    private String organizationType;

    /**
     * 组织描述
     */
    @Column(name = "organization_describe")
    private String organizationDescribe;

    /**
     * 组织位置
     */
    @Column(name = "organization_location")
    private String organizationLocation;

    /**
     * 组织详细地址
     */
    @Column(name = "organization_address")
    private String organizationAddress;

    /**
     * 组织电话
     */
    @Column(name = "organization_phone")
    private String organizationPhone;

    /**
     * 组织创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 上级组织
     */
    private Long pid;

    /**
     * 更新部门信息时间
     */
    @Column(name = "updated_at")
    private Date updatedAt;


    @Transient
    private List<Organization> organizationList;


    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(List<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    /**
     * 获取id
     *
     * @return organization_id - id
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * 设置id
     *
     * @param organizationId id
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * 获取组织名称
     *
     * @return organization_name - 组织名称
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * 设置组织名称
     *
     * @param organizationName 组织名称
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * 获取组织类型
     *
     * @return organization_type - 组织类型
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * 设置组织类型
     *
     * @param organizationType 组织类型
     */
    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    /**
     * 获取组织描述
     *
     * @return organization_describe - 组织描述
     */
    public String getOrganizationDescribe() {
        return organizationDescribe;
    }

    /**
     * 设置组织描述
     *
     * @param organizationDescribe 组织描述
     */
    public void setOrganizationDescribe(String organizationDescribe) {
        this.organizationDescribe = organizationDescribe;
    }

    /**
     * 获取组织位置
     *
     * @return organization_location - 组织位置
     */
    public String getOrganizationLocation() {
        return organizationLocation;
    }

    /**
     * 设置组织位置
     *
     * @param organizationLocation 组织位置
     */
    public void setOrganizationLocation(String organizationLocation) {
        this.organizationLocation = organizationLocation;
    }

    /**
     * 获取组织详细地址
     *
     * @return organization_address - 组织详细地址
     */
    public String getOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * 设置组织详细地址
     *
     * @param organizationAddress 组织详细地址
     */
    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    /**
     * 获取组织电话
     *
     * @return organization_phone - 组织电话
     */
    public String getOrganizationPhone() {
        return organizationPhone;
    }

    /**
     * 设置组织电话
     *
     * @param organizationPhone 组织电话
     */
    public void setOrganizationPhone(String organizationPhone) {
        this.organizationPhone = organizationPhone;
    }

    /**
     * 获取组织创建时间
     *
     * @return created_at - 组织创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置组织创建时间
     *
     * @param createdAt 组织创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取上级组织
     *
     * @return pid - 上级组织
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置上级组织
     *
     * @param pid 上级组织
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取更新部门信息时间
     *
     * @return updated_at - 更新部门信息时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置更新部门信息时间
     *
     * @param updatedAt 更新部门信息时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}