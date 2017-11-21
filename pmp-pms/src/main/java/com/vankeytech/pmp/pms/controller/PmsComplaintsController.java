package com.vankeytech.pmp.pms.controller;

import com.vankeytech.pmp.pms.entity.JsonResult;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.service.PmsComplaintsService;
import com.vankeytech.pmp.pms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 投诉管理
 */
@RestController
@RequestMapping(value = "/pmsComplaints")
public class PmsComplaintsController {
    @Autowired
    private PmsComplaintsService pmsComplaintsService;

    /**
     * 全查
     * @return
     */
    @GetMapping("/selectAll")
    public JsonResult getComplaintsList(){
        return ResponseUtil.success(pmsComplaintsService.selectAll());
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @DeleteMapping("/delete/{id}")
    @Transactional
    public JsonResult deleteComplaints(@PathVariable("id") String ids){
        return ResponseUtil.success(pmsComplaintsService.deleteByIds(ids));
    }

    /**
     * 新增
     * @param pmsComplaints
     * @return
     */
    @PostMapping("/insert")
    @Transactional
    public JsonResult addComplaints(@Validated PmsComplaints pmsComplaints) {

        return ResponseUtil.success(pmsComplaintsService.insert(pmsComplaints));
    }
    /**
     * 详情
     * @param
     * @return
     */
    @GetMapping("/details/{id}")
    @Transactional
    public JsonResult particularsComplaints(@PathVariable("id") String ids) {

        return ResponseUtil.success(pmsComplaintsService.selectByIds(ids));
    }

}
