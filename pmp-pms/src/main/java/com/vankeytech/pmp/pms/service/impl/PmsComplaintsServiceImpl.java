package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.mapper.PmsComplaintsMapper;
import com.vankeytech.pmp.pms.service.PmsComplaintsService;
import org.springframework.stereotype.Service;

/**
 * @author daibaocheng
 */
@Service
public class PmsComplaintsServiceImpl extends BaseService<PmsComplaints> implements PmsComplaintsService {
    public PmsComplaintsServiceImpl(PmsComplaintsMapper pmsComplaintsMapper) {
        super(pmsComplaintsMapper);
    }
}
