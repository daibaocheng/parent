package com.vankeytech.pmp.pms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsComplaintsService extends Service<PmsComplaints> {
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsComplaints> selectPmsComplaintsByconditions(Map<String,Object> map);
}
