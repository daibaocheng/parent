package com.vankeytech.pmp.auth.intf;

import com.vankeytech.pmp.auth.entity.Organization;

import java.util.List;

/**
 * @author  xieliang
 */
public interface OrganizationIntf {

    /**
     * 新增部门
     * @param organization
     */
    void insert(Organization organization);

    /**
     * 更改部门名称
     * @param organization 部门名称
     */
    void updateName(Organization organization);

    /**
     * 根据id删除组织结构
     * @param organization
     */
    void deleteOrganization(Organization organization);

    /**
     *
     * @return
     */
    List<Organization> getOrganizationAll();


}
