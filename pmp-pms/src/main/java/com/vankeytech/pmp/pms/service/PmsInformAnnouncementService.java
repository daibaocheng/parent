package com.vankeytech.pmp.pms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsInformAnnouncementService extends Service<PmsInformAnnouncement> {

    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsInformAnnouncement> selectByconditions(Map<String,Object> map);
}
