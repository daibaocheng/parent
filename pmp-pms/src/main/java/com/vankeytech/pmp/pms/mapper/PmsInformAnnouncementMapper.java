package com.vankeytech.pmp.pms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsInformAnnouncementMapper extends BasicMapper<PmsInformAnnouncement> {
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsInformAnnouncement> selectPmsInformAnnouncementByCondition(@Param("map")Map<String,Object> map);
}