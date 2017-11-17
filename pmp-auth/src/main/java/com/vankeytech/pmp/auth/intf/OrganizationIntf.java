package com.vankeytech.pmp.auth.intf;

import com.vankeytech.pmp.auth.entity.Organization;

public interface OrganizationIntf {

    /**
     * 新增部门
     * @param organization
     */
    void insert(Organization organization);

    /**
     * 更改部门名称
     * @param name 部门名称
     */
    void updateName(String name);

    /**
     * 根据id删除组织结构
     * @param organizationId
     */
    void deleteOrganization(Integer organizationId);



}
