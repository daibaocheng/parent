package com.vankeytech.pmp.auth.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.auth.entity.Organization;
import com.vankeytech.pmp.auth.mapper.OrganizationMapper;
import com.vankeytech.pmp.auth.service.OrganizationService;
import org.springframework.stereotype.Service;

/**
 * @author xieliang
 */
@Service
public class OrganizationServiceImpl extends BaseService<Organization> implements OrganizationService{

    public OrganizationServiceImpl(OrganizationMapper organizationMapper) {
        super(organizationMapper);
    }
}
