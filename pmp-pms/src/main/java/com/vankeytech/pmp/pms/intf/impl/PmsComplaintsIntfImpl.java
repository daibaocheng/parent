package com.vankeytech.pmp.pms.intf.impl;

import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.intf.PmsComplaintsIntf;
import com.vankeytech.pmp.pms.service.PmsComplaintsService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;

/**
 * @author daibaocheng
 */
@Component
public class PmsComplaintsIntfImpl implements PmsComplaintsIntf {

    @Resource
    private PmsComplaintsService pmsComplaintsService;

    @Override
    public List<PmsComplaints> selectPmsComplaintsByCondition(Map<String, Object> map) {
        return pmsComplaintsService.selectPmsComplaintsByconditions(map);
    }

    @Override
    public List<PmsComplaints> selectAll() {
        return pmsComplaintsService.selectAll();
    }


    @Override
    public List<PmsComplaints> selectByIds(String ids) {
        return pmsComplaintsService.selectByIds(ids);
    }

    @Override
    public Integer selectCount(PmsComplaints pmsComplaints) {
        return pmsComplaintsService.selectCount(pmsComplaints);
    }


    @Override
    public Integer insertPmsComplaints(PmsComplaints pmsComplaints) {
        return pmsComplaintsService.insert(pmsComplaints);
    }

    @Override
    public Integer insertPmsComplaintsList(List<PmsComplaints> pmsComplaintsList) {
        return pmsComplaintsService.insertList(pmsComplaintsList);
    }

    @Override
    public Integer updatePmsComplaints(PmsComplaints pmsComplaints) {
        return pmsComplaintsService.updateByPrimaryKey(pmsComplaints);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return pmsComplaintsService.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return pmsComplaintsService.deleteByIds(ids);
    }
}
