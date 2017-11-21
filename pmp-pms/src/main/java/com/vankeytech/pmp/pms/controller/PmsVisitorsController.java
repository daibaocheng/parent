package com.vankeytech.pmp.pms.controller;

import com.vankeytech.pmp.pms.entity.JsonResult;
import com.vankeytech.pmp.pms.entity.PmsVisitors;
import com.vankeytech.pmp.pms.intf.PmsVisitorsIntf;
import com.vankeytech.pmp.pms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 访客管理
 */
@RestController
@RequestMapping(value = "/pmsVisitors")
public class PmsVisitorsController {
    @Autowired
    private PmsVisitorsIntf pmsVisitorsIntf;

    /**
     * 全查
     * @return
     */
    @GetMapping("/selectAll")
    public JsonResult getPmsVisitorsPmsInformAnnouncementList(){
        return ResponseUtil.success(pmsVisitorsIntf.selectAll());
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @DeleteMapping("/delete/{id}")
    @Transactional
    public JsonResult deletePmsVisitors(@PathVariable("id") String ids){
        return ResponseUtil.success(pmsVisitorsIntf.deleteByIds(ids));
    }

    /**
     * 新增
     * @param pmsVisitors
     * @return
     */
    @PostMapping("/add")
    @Transactional
    public JsonResult insertPmsVisitors(@Validated PmsVisitors pmsVisitors) {

        return ResponseUtil.success(pmsVisitorsIntf.insert(pmsVisitors));
    }
    /**
     * 详情
     * @param
     * @return
     */
    @GetMapping("/details/{id}")
    @Transactional
    public JsonResult particularsPmsVisitors(@PathVariable("id") String ids) {

        return ResponseUtil.success(pmsVisitorsIntf.selectByIds(ids));
    }
}
