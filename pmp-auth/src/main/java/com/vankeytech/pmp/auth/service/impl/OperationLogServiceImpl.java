package com.vankeytech.pmp.auth.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.auth.entity.OperationLog;
import com.vankeytech.pmp.auth.mapper.OperationLogMapper;
import com.vankeytech.pmp.auth.service.OperationLogService;
import org.springframework.stereotype.Service;

/**
 * @author xieliang
 */
@Service
public class OperationLogServiceImpl extends BaseService<OperationLog> implements OperationLogService {

    public OperationLogServiceImpl(OperationLogMapper operationLogMapper) {
        super(operationLogMapper);
    }
}
