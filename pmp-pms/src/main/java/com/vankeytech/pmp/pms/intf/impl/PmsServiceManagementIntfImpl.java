package com.vankeytech.pmp.pms.intf.impl;

import com.vankeytech.pmp.pms.entity.PmsServiceManagement;
import com.vankeytech.pmp.pms.intf.PmsServiceManagementIntf;
import com.vankeytech.pmp.pms.service.PmsServiceManagementService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;

/**
 * @author daibaocheng
 */
@Component
public class PmsServiceManagementIntfImpl implements PmsServiceManagementIntf{

    @Resource
    private PmsServiceManagementService pmsServiceManagementService;

    @Override
    public List<PmsServiceManagement> selectPmsServiceManagementByCondition(Map<String, Object> map) {
        return pmsServiceManagementService.selectPmsServiceManagementByconditions(map);
    }

    @Override
    public List<PmsServiceManagement> selectAll() {
        return pmsServiceManagementService.selectAll();
    }


    @Override
    public List<PmsServiceManagement> selectByIds(String ids) {
        return pmsServiceManagementService.selectByIds(ids);
    }

    @Override
    public Integer selectCount(PmsServiceManagement pmsServiceManagement) {
        return pmsServiceManagementService.selectCount(pmsServiceManagement);
    }


    @Override
    public Integer insertPmsServiceManagement(PmsServiceManagement pmsServiceManagement) {
        return pmsServiceManagementService.insert(pmsServiceManagement);
    }

    @Override
    public Integer insertPmsServiceManagementList(List<PmsServiceManagement> pmsServiceManagementList) {
        return pmsServiceManagementService.insertList(pmsServiceManagementList);
    }

    @Override
    public Integer updatePmsServiceManagement(PmsServiceManagement pmsServiceManagement) {
        return pmsServiceManagementService.updateByPrimaryKey(pmsServiceManagement);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return pmsServiceManagementService.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return null;
    }
}
