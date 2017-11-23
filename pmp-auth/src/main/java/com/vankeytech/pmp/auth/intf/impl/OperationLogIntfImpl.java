package com.vankeytech.pmp.auth.intf.impl;

import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.entity.OperationLog;
import com.vankeytech.pmp.auth.intf.OperationLogIntf;
import com.vankeytech.pmp.auth.service.OperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  xieliang
 */

@Service
public class OperationLogIntfImpl implements OperationLogIntf {

    @Autowired
    private OperationLogService operationLogService;


    @Override
    public void insertLog(OperationLog operationLog) {
        operationLogService.addLog(operationLog);
    }


    @Override
    public PageInfo<OperationLog> pageSelect(Integer page, Integer pageSize,OperationLog operationLog) {
        return operationLogService.selectPage(page,pageSize,operationLog);
    }

    /**
     * 文件下载
     */
    @Override
    public void downloadLogFile() {
        operationLogService.exportLogExcel();
    }
}
