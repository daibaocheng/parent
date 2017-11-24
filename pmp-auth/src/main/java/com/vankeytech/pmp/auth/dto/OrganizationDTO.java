package com.vankeytech.pmp.auth.dto;


import java.io.Serializable;

/**
 * 部门组织DTO
 * @author  xielaing
 */
public class OrganizationDTO implements Serializable {

    /**
     * id
     */
    private  Integer organizationId;

    /**
     * 父id
     */
    private  Integer pid;

    /**
     * 组织名称
     */
    private  String organizationName;


    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public String toString() {
        return "OrganizationDTO{" +
                "organizationId=" + organizationId +
                ", pid=" + pid +
                ", organizationName='" + organizationName + '\'' +
                '}';
    }
}
