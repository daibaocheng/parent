package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsServiceManagement;
import com.vankeytech.pmp.pms.mapper.PmsServiceManagementMapper;
import com.vankeytech.pmp.pms.service.PmsServiceManagementService;
import com.vankeytech.pmp.pms.service.PmsVisitorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PmsServiceManagementServiceImpl extends BaseService<PmsServiceManagement> implements PmsServiceManagementService {
    public PmsServiceManagementServiceImpl(PmsServiceManagementMapper pmsServiceManagementMapper) {
        super(pmsServiceManagementMapper);
    }

    @Autowired
    private PmsServiceManagementService pmsServiceManagementService;

    @Override
    public List<PmsServiceManagement> selectByconditions(Map<String, Object> map) {
        return pmsServiceManagementService.selectByconditions(map);
    }
}
