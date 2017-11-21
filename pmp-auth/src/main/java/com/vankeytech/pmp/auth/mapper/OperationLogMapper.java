package com.vankeytech.pmp.auth.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.auth.dto.OperationLogDTO;
import com.vankeytech.pmp.auth.entity.OperationLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xieliang
 */
@Repository
public interface OperationLogMapper extends BasicMapper<OperationLog> {

    /**
     * 条件查询日志信息
     * @param operationLogDTO 查询实体
     * @return
     */
    List<OperationLog> selectByCondition(OperationLogDTO operationLogDTO);


}