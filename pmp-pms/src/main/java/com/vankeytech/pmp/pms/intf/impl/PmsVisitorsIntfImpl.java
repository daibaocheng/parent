package com.vankeytech.pmp.pms.intf.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsVisitors;
import com.vankeytech.pmp.pms.intf.PmsVisitorsIntf;
import com.vankeytech.pmp.pms.mapper.PmsVisitorsMapper;
import org.springframework.stereotype.Service;

/**
 * @author daibaocheng
 */
//@Service
public class PmsVisitorsIntfImpl extends BaseService<PmsVisitors> implements PmsVisitorsIntf {
    public PmsVisitorsIntfImpl(PmsVisitorsMapper pmsVisitorsMapper) {
        super(pmsVisitorsMapper);
    }
}
