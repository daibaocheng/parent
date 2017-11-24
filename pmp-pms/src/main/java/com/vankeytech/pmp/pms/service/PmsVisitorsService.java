package com.vankeytech.pmp.pms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.entity.PmsVisitors;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsVisitorsService extends Service<PmsVisitors> {
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsVisitors> selectPmsVisitorsByconditions(Map<String,Object> map);
}
