package com.vankeytech.pmp.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.auth.entity.OperationLog;
import com.vankeytech.pmp.auth.mapper.OperationLogMapper;
import com.vankeytech.pmp.auth.service.OperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * @author xieliang
 */
@Service
public class OperationLogServiceImpl extends BaseService<OperationLog> implements OperationLogService {

    public OperationLogServiceImpl(OperationLogMapper operationLogMapper) {
        super(operationLogMapper);
    }

    @Autowired
    private OperationLogMapper operationLogMapper;

    /**
     * 添加日志
     *
     * @param operationLog
     */
    @Override
    public void addLog(OperationLog operationLog) {
        operationLogMapper.insert(operationLog);
    }

    /**
     * 查询并分页
     * @param page
     * @param pageSize
     * @param operationLog
     * @return
     */
    @Override
    public PageInfo<OperationLog> selectPage(Integer page, Integer pageSize, OperationLog operationLog) {
        List<OperationLog> operationLogs=null;

        if(operationLog == null){
            operationLogs=operationLogMapper.selectAll();
        }else{
            Condition condition = new Condition(operationLog.getClass());
            condition.and().andEqualTo("areaName",operationLog.getAreaName())
                     .andBetween("operationAt",operationLog.getStartTime(),operationLog.getEndTime())
                     .andEqualTo("moduleName", operationLog.getModuleName())
                     .andEqualTo("oerationName", operationLog.getOerationName())
                     .andEqualTo("plateNumber", operationLog.getPlateNumber());
            operationLogs=operationLogMapper.selectByCondition(condition);
        }
        PageHelper.startPage(page,pageSize);
        PageInfo<OperationLog> pageInfo = new PageInfo<OperationLog>(operationLogs);
        return pageInfo;
    }
}
