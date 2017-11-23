package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsVisitors;
import com.vankeytech.pmp.pms.mapper.PmsVisitorsMapper;
import com.vankeytech.pmp.pms.service.PmsVisitorsService;
import org.springframework.stereotype.Service;

/**
 * @author daibaocheng
 */
@Service
public class PmsVisitorsServiceImpl  extends BaseService<PmsVisitors> implements PmsVisitorsService {
    public PmsVisitorsServiceImpl(PmsVisitorsMapper pmsVisitorsMapper) {
        super(pmsVisitorsMapper);
    }
}
