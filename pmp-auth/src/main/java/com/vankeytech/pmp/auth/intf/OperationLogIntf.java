package com.vankeytech.pmp.auth.intf;

import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.entity.OperationLog;


/**
 * @author  xieliang
 */
public interface OperationLogIntf {
    /**
     * 添加操作日志
     * @param oerationLog
     */
    void insertLog(OperationLog oerationLog);

    /**
     * 分页查询
     * @param page 当前页数
     * @param pageSize  每页数量
     * @return
     */
    PageInfo<OperationLog> pageSelect(Integer page, Integer pageSize, OperationLog operationLog);

    /**
     * 文件下载
     */
    void downloadLogFile();

}
