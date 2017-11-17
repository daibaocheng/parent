package com.vankeytech.pmp.auth.intf;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author  xieliang
 */
public interface OperationLogIntf {
    /**
     * 添加操作日志
     * @param oerationLogIntf
     */
    void insertLog(OperationLogIntf oerationLogIntf);

    /**
     *查询全部操作日志
     * @return
     */
    List<OperationLogIntf> selectAll();

    /**
     * 分页查询
     * @param page 当前页数
     * @param pageSize  每页数量
     * @return
     */
    PageInfo<OperationLogIntf> pageSelect(Integer page, Integer pageSize);


}
