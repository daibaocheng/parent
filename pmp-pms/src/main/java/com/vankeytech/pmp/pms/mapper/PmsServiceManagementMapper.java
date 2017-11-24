package com.vankeytech.pmp.pms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import com.vankeytech.pmp.pms.entity.PmsServiceManagement;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsServiceManagementMapper extends BasicMapper<PmsServiceManagement> {

    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsServiceManagement> selectPmsServiceManagementByCondition(@Param("map")Map<String,Object> map);

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