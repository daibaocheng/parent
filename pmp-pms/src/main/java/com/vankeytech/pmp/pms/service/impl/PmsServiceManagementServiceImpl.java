package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsServiceManagement;
import com.vankeytech.pmp.pms.mapper.PmsServiceManagementMapper;
import com.vankeytech.pmp.pms.service.PmsServiceManagementService;
import org.springframework.stereotype.Service;

/**
 * @author daibaocheng
 */
@Service
public class PmsServiceManagementServiceImpl extends BaseService<PmsServiceManagement> implements PmsServiceManagementService {
    public PmsServiceManagementServiceImpl(PmsServiceManagementMapper pmsServiceManagementMapper) {
        super(pmsServiceManagementMapper);
    }
}
