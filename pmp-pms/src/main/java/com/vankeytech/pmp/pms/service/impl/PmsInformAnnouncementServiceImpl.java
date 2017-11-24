package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import com.vankeytech.pmp.pms.mapper.PmsInformAnnouncementMapper;
import com.vankeytech.pmp.pms.service.PmsInformAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PmsInformAnnouncementServiceImpl  extends BaseService<PmsInformAnnouncement> implements PmsInformAnnouncementService{
    public PmsInformAnnouncementServiceImpl(PmsInformAnnouncementMapper pmsInformAnnouncementMapper) {
        super(pmsInformAnnouncementMapper);
    }

    @Autowired
    private PmsInformAnnouncementMapper pmsInformAnnouncementMapper;

    @Override
    public List<PmsInformAnnouncement> selectByconditions(Map<String,Object> map) {

        return pmsInformAnnouncementMapper.selectPmsInformAnnouncementCondition(map);
    }
}
