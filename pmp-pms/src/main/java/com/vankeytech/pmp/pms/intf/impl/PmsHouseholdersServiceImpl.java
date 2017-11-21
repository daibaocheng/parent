package com.vankeytech.pmp.pms.intf.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.entity.PmsHouseholders;
import com.vankeytech.pmp.pms.intf.PmsCommunityService;
import com.vankeytech.pmp.pms.intf.PmsHouseholdersService;
import com.vankeytech.pmp.pms.mapper.PmsHouseholdersMapper;

public class PmsHouseholdersServiceImpl extends BaseService<PmsHouseholders> implements PmsHouseholdersService {
    public PmsHouseholdersServiceImpl(PmsHouseholdersMapper pmsHouseholdersMapper) {
        super(pmsHouseholdersMapper);
    }
}
