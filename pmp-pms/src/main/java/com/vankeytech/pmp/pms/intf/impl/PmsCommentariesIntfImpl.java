package com.vankeytech.pmp.pms.intf.impl;


import com.vankeytech.pmp.pms.entity.PmsCommentaries;
import com.vankeytech.pmp.pms.intf.PmsCommentariesIntf;
import com.vankeytech.pmp.pms.service.PmsCommentariesService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
@Component
public class PmsCommentariesIntfImpl implements PmsCommentariesIntf{

//    @Resource
//    private CommonIntf commonIntf;

    @Resource
    private PmsCommentariesService pmsCommentariesService;

    @Override
    public List<PmsCommentaries> selectByconditions(Map<String, Object> map) {
        return pmsCommentariesService.selectByconditions(map);
    }

    @Override
    public Integer updateAccordingStateById(Integer id) {
        return pmsCommentariesService.updateAccordingStateById(id);
    }

//    @Override
//    public List<Map<String,Object>> selectAllByConcatenon() {
//        return pmsCommentariesService.selectAllByConcatenon();
//    }
}
