package com.vankeytech.pmp.pms.controller;

import com.vankeytech.pmp.pms.entity.JsonResult;
import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import com.vankeytech.pmp.pms.intf.PmsInformAnnouncementIntf;
import com.vankeytech.pmp.pms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * 通知管理
 */
@RestController
@RequestMapping(value = "/pmsInformAnnouncement")
public class PmsInformAnnouncementController {

    @Autowired
    private PmsInformAnnouncementIntf pmsInformAnnouncementIntf;



    /**
     * 全查
     * @return
     */
    @GetMapping("/selectAll")
    public JsonResult getPmsInformAnnouncementList(){
        System.out.println("结果为"+pmsInformAnnouncementIntf.selectAll());
        return ResponseUtil.success(pmsInformAnnouncementIntf.selectAll());
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @GetMapping("/delete/{id}")
    @Transactional
    public JsonResult deletePmsInformAnnouncement(@PathVariable("id") String ids){
        return ResponseUtil.success(pmsInformAnnouncementIntf.deleteByIds(ids));
    }

    /**
     * 新增
     * @param pmsInformAnnouncement
     * @return
     */
    @PostMapping("/insert")
    @Transactional
    public JsonResult addPmsInformAnnouncement(@Validated PmsInformAnnouncement pmsInformAnnouncement) {

        return ResponseUtil.success(pmsInformAnnouncementIntf.insert(pmsInformAnnouncement));
    }
    /**
     * 详情
     * @param ids
     * @return
     */
    @GetMapping("/details/{id}")
    @Transactional
    public JsonResult particularsPmsInformAnnouncement(@PathVariable("id") String ids) {

        return ResponseUtil.success(pmsInformAnnouncementIntf.selectByIds(ids));
    }
    /**
     * 条件查询
     * @param pmsInformAnnouncement
     * @return
     */
    @PostMapping("/details/{map}")
    @Transactional
    public JsonResult findConditionsPmsInformAnnouncement(@PathVariable("pmsInformAnnouncement") PmsInformAnnouncement pmsInformAnnouncement) {

//        return ResponseUtil.success(pmsInformAnnouncement.);
//        pmsInformAnnouncementIntf.selectByCondition();
//        pmsInformAnnouncementIntf.
        return null;
    }
}
