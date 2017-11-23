package com.vankeytech.pmp.auth.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.auth.entity.Overtime;
import com.vankeytech.pmp.auth.mapper.OvertimeMapper;
import com.vankeytech.pmp.auth.service.OvertimeService;
import org.springframework.stereotype.Service;

/**
 * @author  xieliang
 */
@Service
public class OvertimeServiceImpl extends BaseService<Overtime> implements OvertimeService {

    public OvertimeServiceImpl(OvertimeMapper overtimeMapper) {
        super(overtimeMapper);
    }
}
