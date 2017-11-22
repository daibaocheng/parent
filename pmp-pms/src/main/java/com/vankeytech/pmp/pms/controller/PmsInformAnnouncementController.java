package com.vankeytech.pmp.pms.controller;

import com.vankeytech.pmp.pms.entity.JsonResult;
import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import com.vankeytech.pmp.pms.service.PmsInformAnnouncementService;
import com.vankeytech.pmp.pms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * 通知管理
 */
@RestController
@RequestMapping(value = "/pmsInformAnnouncement")
public class PmsInformAnnouncementController {

    @Resource
    private PmsInformAnnouncementService pmsInformAnnouncementService;



    /**
     * 全查
     * @return
     */
    @GetMapping("/selectAll")
    public String getPmsInformAnnouncementList(Model model){
//        return ResponseUtil.success(pmsInformAnnouncementService.selectAll());
        List<PmsInformAnnouncement> pmsList=pmsInformAnnouncementService.selectAll();
        model.addAttribute("pmsList",pmsList);
        return "test";
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @GetMapping("/delete/{id}")
    @Transactional
    public JsonResult deletePmsInformAnnouncement(@PathVariable("id") String ids){
        return ResponseUtil.success(pmsInformAnnouncementService.deleteByIds(ids));
    }

    /**
     * 新增
     * @param pmsInformAnnouncement
     * @return
     */
    @PostMapping("/insert")
    @Transactional
    public JsonResult addPmsInformAnnouncement(@Validated PmsInformAnnouncement pmsInformAnnouncement) {

        return ResponseUtil.success(pmsInformAnnouncementService.insert(pmsInformAnnouncement));
    }
    /**
     * 详情
     * @param ids
     * @return
     */
    @GetMapping("/details/{id}")
    @Transactional
    public JsonResult particularsPmsInformAnnouncement(@PathVariable("id") String ids) {

        return ResponseUtil.success(pmsInformAnnouncementService.selectByIds(ids));
    }
    /**
     * 条件查询
     * @param pmsInformAnnouncement
     * @return
     */
    @GetMapping("/condition")
    @Transactional
    public JsonResult findConditionsPmsInformAnnouncement(@PathVariable("pmsInformAnnouncement") PmsInformAnnouncement pmsInformAnnouncement) {


        Condition  condition=new Condition(PmsInformAnnouncement.class);
        condition.selectProperties("f","a");
        return ResponseUtil.success(condition.toString());
    }
}
