package com.vankeytech.pmp.pms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.pms.entity.PmsCommentaries;
import com.vankeytech.pmp.pms.entity.PmsVisitors;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsVisitorsMapper extends BasicMapper<PmsVisitors> {
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsVisitors> selectPmsVisitorsByCondition(@Param("map")Map<String,Object> map);
}