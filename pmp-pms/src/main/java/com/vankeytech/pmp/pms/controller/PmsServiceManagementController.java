package com.vankeytech.pmp.pms.controller;

import com.vankeytech.pmp.pms.entity.JsonResult;
import com.vankeytech.pmp.pms.entity.PmsServiceManagement;
import com.vankeytech.pmp.pms.intf.PmsServiceManagementIntf;
import com.vankeytech.pmp.pms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 报修管理
 */
@RestController
@RequestMapping(value = "/pmsServiceManagement")
public class PmsServiceManagementController {
    @Autowired
    private PmsServiceManagementIntf pmsServiceManagementIntf;

    /**
     * 全查
     * @return
     */
    @GetMapping("/selectAll")
    public JsonResult getPmsInformAnnouncementList(){
        return ResponseUtil.success(pmsServiceManagementIntf.selectAll());
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @DeleteMapping("/delete/{id}")
    @Transactional
    public JsonResult deletePmsInformAnnouncement(@PathVariable("id") String ids){
        return ResponseUtil.success(pmsServiceManagementIntf.deleteByIds(ids));
    }

    /**
     * 新增
     * @param pmsServiceManagement
     * @return
     */
    @PostMapping("/insert")
    @Transactional
    public JsonResult addPmsInformAnnouncement(@Validated PmsServiceManagement pmsServiceManagement) {
        return ResponseUtil.success(pmsServiceManagementIntf.insert(pmsServiceManagement));
    }
    /**
     * 详情
     * @param ids
     * @return
     */
    @GetMapping("/details/{id}")
    @Transactional
    public JsonResult particularsPmsInformAnnouncement(@PathVariable("id") String ids) {

        return ResponseUtil.success(pmsServiceManagementIntf.selectByIds(ids));
    }
}
