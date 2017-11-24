package com.vankeytech.pmp.pms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsComplaintsMapper extends BasicMapper<PmsComplaints> {
    /**
     * 根据id修改处理状态
     * @param id
     * @return
     */
    Integer updateStatus(@Param("id") Integer id);

    /**
     * 条件查询投诉信息(受理日期，处理状态，关键字)
     * @param map
     * @return
     */
    List<PmsComplaints> selectPmsComplaintsByCondition(@Param("map") Map<String,Object> map);
}