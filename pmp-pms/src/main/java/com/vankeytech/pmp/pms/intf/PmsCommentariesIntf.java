package com.vankeytech.pmp.pms.intf;

import com.vankeytech.pmp.pms.entity.PmsCommentaries;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsCommentariesIntf {
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
//     * 全查
//     * @return
//     */
//    List<Map<String,Object>> selectAllByConcatenon();
}
