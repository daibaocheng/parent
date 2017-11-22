package com.vankeytech.pmp.pms.intf.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.intf.PmsComplaintsIntf;
import com.vankeytech.pmp.pms.mapper.PmsComplaintsMapper;
import org.springframework.stereotype.Service;

/**
 * @author daibaocheng
 */
@Service
public class PmsComplaintsIntfImpl extends BaseService<PmsComplaints> implements PmsComplaintsIntf {
    public PmsComplaintsIntfImpl(PmsComplaintsMapper pmsComplaintsMapper) {
        super(pmsComplaintsMapper);
    }
}
