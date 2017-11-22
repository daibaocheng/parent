package com.vankeytech.pmp.pms.intf.impl;


import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import com.vankeytech.pmp.pms.intf.PmsInformAnnouncementIntf;
import com.vankeytech.pmp.pms.service.PmsInformAnnouncementService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * @author daibaocheng
 */
@Component
public class PmsInformAnnouncementIntfImpl implements PmsInformAnnouncementIntf{

    @Resource
    private PmsInformAnnouncementService pmsInformAnnouncementService;

    @Override
    public List<PmsInformAnnouncement> selectAll() {
        return pmsInformAnnouncementService.selectAll();
    }


    @Override
    public List<PmsInformAnnouncement> selectByIds(String ids) {
        return pmsInformAnnouncementService.selectByIds(ids);
    }

    @Override
    public Integer selectCount(PmsInformAnnouncement pmsInformAnnouncement) {
        return pmsInformAnnouncementService.selectCount(pmsInformAnnouncement);
    }


    @Override
    public Integer insertPmsInformAnnouncement(PmsInformAnnouncement pmsInformAnnouncement) {
        return pmsInformAnnouncementService.insert(pmsInformAnnouncement);
    }

    @Override
    public Integer insertPmsInformAnnouncementList(List<PmsInformAnnouncement> pmsInformAnnouncementList) {
        return pmsInformAnnouncementService.insertList(pmsInformAnnouncementList);
    }

    @Override
    public Integer updatePmsInformAnnouncement(PmsInformAnnouncement pmsInformAnnouncement) {
        return pmsInformAnnouncementService.updateByPrimaryKey(pmsInformAnnouncement);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return pmsInformAnnouncementService.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return pmsInformAnnouncementService.deleteByIds(ids);
    }
}
