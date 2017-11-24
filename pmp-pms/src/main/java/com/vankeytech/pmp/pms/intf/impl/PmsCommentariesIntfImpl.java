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
//    private co commonIntf;

    @Resource
    private PmsCommentariesService pmsCommentariesService;

    @Override
    public List<PmsCommentaries> selectPmsCommentariesByconditions(Map<String, Object> map) {
        return pmsCommentariesService.selectPmsCommentariesByconditions(map);
    }

    @Override
    public Integer updateAccordingStateById(Integer id) {
        return pmsCommentariesService.updateAccordingStateById(id);
    }

    @Override
    public List<Map<String, Object>> selectAllByConcatenon(List<Integer> ids) {
        return pmsCommentariesService.selectAllByConcatenon(ids);
    }
}
