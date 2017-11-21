package com.vankeytech.pmp.pms.controller;

import com.vankeytech.pmp.pms.entity.JsonResult;
import com.vankeytech.pmp.pms.entity.PmsServiceManagement;
import com.vankeytech.pmp.pms.service.PmsServiceManagementService;
import com.vankeytech.pmp.pms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 报修管理
 */
@RestController
@RequestMapping(value = "/pmsServiceManagement")
public class PmsServiceManagementController {
    @Resource
    private PmsServiceManagementService pmsServiceManagementService;

    /**
     * 全查
     * @return
     */
    @GetMapping("/selectAll")
    public JsonResult getPmsInformAnnouncementList(){
        return ResponseUtil.success(pmsServiceManagementService.selectAll());
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @DeleteMapping("/delete/{id}")
    @Transactional
    public JsonResult deletePmsInformAnnouncement(@PathVariable("id") String ids){
        return ResponseUtil.success(pmsServiceManagementService.deleteByIds(ids));
    }

    /**
     * 新增
     * @param pmsServiceManagement
     * @return
     */
    @PostMapping("/insert")
    @Transactional
    public JsonResult addPmsInformAnnouncement(@Validated PmsServiceManagement pmsServiceManagement) {
        return ResponseUtil.success(pmsServiceManagementService.insert(pmsServiceManagement));
    }
    /**
     * 详情
     * @param ids
     * @return
     */
    @GetMapping("/details/{id}")
    @Transactional
    public JsonResult particularsPmsInformAnnouncement(@PathVariable("id") String ids) {

        return ResponseUtil.success(pmsServiceManagementService.selectByIds(ids));
    }
}
