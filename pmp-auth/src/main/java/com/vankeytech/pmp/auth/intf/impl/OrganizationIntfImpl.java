package com.vankeytech.pmp.auth.intf.impl;

import com.vankeytech.pmp.auth.entity.Organization;
import com.vankeytech.pmp.auth.intf.OrganizationIntf;
import com.vankeytech.pmp.auth.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xielaing
 */
@Service
public class OrganizationIntfImpl implements OrganizationIntf {

    @Autowired
    private OrganizationService organizationService;

    @Override
    public void insert(Organization organization) {
        organizationService.insert(organization);
    }

    @Override
    public void updateName(Organization organization) {
        organizationService.updateByPrimaryKeySelective(organization);
    }

    @Override
    public void deleteOrganization(Organization organization) {

    }


    /**
     * @return
     */
    @Override
    public List<Organization> getOrganizationAll() {
        return organizationService.selectAll();
    }
}
