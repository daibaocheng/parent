package com.vankeytech.pmp.common.entity;

import javax.persistence.*;
import java.util.List;

public class Region {
    /**
     * 地区编码
     */
    @Id
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 地区名称
     */
    @Column(name = "region_name")
    private String regionName;

    /**
     * 父级ID
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 子节点
     */
    @Transient
    private List<Region> children;

    /**
     * 获取地区编码
     *
     * @return region_code - 地区编码
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 设置地区编码
     *
     * @param regionCode 地区编码
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * 获取地区名称
     *
     * @return region_name - 地区名称
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 设置地区名称
     *
     * @param regionName 地区名称
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * 获取父级ID
     *
     * @return parent_id - 父级ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父级ID
     *
     * @param parentId 父级ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<Region> getChildren() {
        return children;
    }

    public void setChildren(List<Region> children) {
        this.children = children;
    }
}