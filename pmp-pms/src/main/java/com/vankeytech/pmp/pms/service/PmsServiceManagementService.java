package com.vankeytech.pmp.pms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.entity.PmsServiceManagement;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsServiceManagementService extends Service<PmsServiceManagement> {
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsServiceManagement> selectByconditions(Map<String,Object> map);
}
