package com.vankeytech.pmp.pms.intf.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsVisitors;
import com.vankeytech.pmp.pms.intf.PmsVisitorsIntf;
import com.vankeytech.pmp.pms.mapper.PmsVisitorsMapper;
import com.vankeytech.pmp.pms.service.PmsServiceManagementService;
import com.vankeytech.pmp.pms.service.PmsVisitorsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * @author daibaocheng
 */
@Component
public class PmsVisitorsIntfImpl implements PmsVisitorsIntf{

    @Resource
    private PmsVisitorsService pmsVisitorsService;

    @Override
    public List<PmsVisitors> selectAll() {
        return pmsVisitorsService.selectAll();
    }


    @Override
    public List<PmsVisitors> selectByIds(String ids) {
        return pmsVisitorsService.selectByIds(ids);
    }

    @Override
    public Integer selectCount(PmsVisitors pmsVisitors) {
        return pmsVisitorsService.selectCount(pmsVisitors);
    }


    @Override
    public Integer insertPmsVisitors(PmsVisitors pmsVisitors) {
        return pmsVisitorsService.insert(pmsVisitors);
    }

    @Override
    public Integer insertPmsVisitorsList(List<PmsVisitors> pmsVisitorsList) {
        return pmsVisitorsService.insertList(pmsVisitorsList);
    }

    @Override
    public Integer updatePmsVisitors(PmsVisitors pmsVisitors) {
        return pmsVisitorsService.updateByPrimaryKey(pmsVisitors);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return pmsVisitorsService.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return pmsVisitorsService.deleteByIds(ids);
    }
}
