package com.vankeytech.pmp.auth.intf.impl;

import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.intf.OperationLogIntf;

import java.util.List;

/**
 * @author  xieliang
 */
public class OperationLogIntfImpl implements OperationLogIntf {


    @Override
    public void insertLog(OperationLogIntf oerationLogIntf) {

    }

    @Override
    public List<OperationLogIntf> selectAll() {
        return null;
    }

    @Override
    public PageInfo<OperationLogIntf> pageSelect(Integer page, Integer pageSize) {
        return null;
    }
}
