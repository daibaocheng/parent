package com.vankeytech.pmp.pms.intf;

import com.vankeytech.pmp.pms.entity.PmsCommentaries;
import org.apache.ibatis.annotations.Param;

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
    List<PmsCommentaries> selectPmsCommentariesByconditions(Map<String,Object> map);
    /**
     * 关闭评论
     * @param id
     * @return
     */
    Integer updateAccordingStateById(Integer id);
    /**
     * 连表查询多个id
     * @param ids
     * @return
     */
    List<Map<String,Object>> selectAllByConcatenon(@Param("ids") List<Integer> ids);


}
