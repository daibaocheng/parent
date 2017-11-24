package com.vankeytech.pmp.pms.service;

import com.vankeytech.baseservice.intf.Service;
import com.vankeytech.pmp.pms.entity.PmsCommentaries;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsCommentariesService extends Service<PmsCommentaries> {
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsCommentaries> selectByconditions(Map<String,Object> map);
    /**
     * 关闭评论
     * @param id
     * @return
     */
    Integer updateAccordingStateById(Integer id);
//    /**
//     * 全查，连表
//     * @return
//     */
//    List<Map<String,Object>> selectAllByConcatenon();
}
