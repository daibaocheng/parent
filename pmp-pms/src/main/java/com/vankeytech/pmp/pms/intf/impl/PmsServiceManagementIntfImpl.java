package com.vankeytech.pmp.pms.intf.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsServiceManagement;
import com.vankeytech.pmp.pms.intf.PmsServiceManagementIntf;
import com.vankeytech.pmp.pms.mapper.PmsServiceManagementMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author daibaocheng
 */
@Component
public class PmsServiceManagementIntfImpl extends BaseService<PmsServiceManagement> implements PmsServiceManagementIntf {
    public PmsServiceManagementIntfImpl(PmsServiceManagementMapper pmsServiceManagementMapper) {
        super(pmsServiceManagementMapper);
    }
}
