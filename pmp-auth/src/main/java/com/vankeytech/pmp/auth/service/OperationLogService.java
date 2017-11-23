package com.vankeytech.pmp.auth.service;

import com.github.pagehelper.PageInfo;
import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.auth.entity.OperationLog;

/**
 * @author  xieliang
 */
public interface OperationLogService extends Service<OperationLog> {
    /**
     * 添加日志
     * @param operationLog
     */
     void addLog(OperationLog operationLog);

    /**
     * 查询并分页
     * @param page
     * @param pageSize
     * @param operationLog
     * @return
     */
     PageInfo<OperationLog> selectPage(Integer page, Integer pageSize, OperationLog operationLog);

    /**
     * 导出日志
     */
    void exportLogExcel();
}
