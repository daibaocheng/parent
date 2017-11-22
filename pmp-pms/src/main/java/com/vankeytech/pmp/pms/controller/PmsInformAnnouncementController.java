package com.vankeytech.pmp.pms.controller;

import com.vankeytech.pmp.pms.entity.JsonResult;
import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import com.vankeytech.pmp.pms.service.PmsInformAnnouncementService;
import com.vankeytech.pmp.pms.util.ResponseUtil;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    /**
     * 全查
     * @return
     */
    @GetMapping("/selectAll")
    public String getPmsInformAnnouncementList(Model model){
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
     * @param
     * @return
     */
    @GetMapping("/condition")
    @Transactional
    public JsonResult findConditionsPmsInformAnnouncement() {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("content","你好");
        map.put("type",0);
        map.put("ispush",0);
        map.put("state",0);
        Date minDate=null;
        Date maxDate=null;
        try {
            minDate=sdf.parse("2000-01-01 00:00:00");
            maxDate=sdf.parse("3000-01-01 00:00:00");
        }catch (Exception e){
            e.printStackTrace();
        }
        map.put("minDate",minDate);
        map.put("maxDate",maxDate);

        return  ResponseUtil.success(pmsInformAnnouncementService.selectByconditions(map));
    }
}
