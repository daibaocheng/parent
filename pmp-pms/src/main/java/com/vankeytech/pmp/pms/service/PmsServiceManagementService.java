package com.vankeytech.pmp.pms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.entity.PmsServiceManagement;
import org.apache.ibatis.annotations.Param;

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
    List<PmsServiceManagement> selectPmsServiceManagementByconditions(Map<String,Object> map);
    /**
     * 接单，派单(修改处理状态)
     * @param id
     * @return
     */
    Integer updateProcessingStateById(@Param("id") Integer id);

    /**
     * 关闭(修改处理状态为5)
     * @param id
     * @return
     */
    Integer updateUnwrapById(@Param("id") Integer id);
}
