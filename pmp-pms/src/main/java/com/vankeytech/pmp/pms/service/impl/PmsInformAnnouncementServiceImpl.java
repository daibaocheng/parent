package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import com.vankeytech.pmp.pms.mapper.PmsInformAnnouncementMapper;
import com.vankeytech.pmp.pms.service.PmsInformAnnouncementService;
import org.springframework.stereotype.Service;

/**
 * @author daibaocheng
 */
@Service
public class PmsInformAnnouncementServiceImpl  extends BaseService<PmsInformAnnouncement> implements PmsInformAnnouncementService {
    public PmsInformAnnouncementServiceImpl(PmsInformAnnouncementMapper pmsInformAnnouncementMapper) {
        super(pmsInformAnnouncementMapper);
    }
}
