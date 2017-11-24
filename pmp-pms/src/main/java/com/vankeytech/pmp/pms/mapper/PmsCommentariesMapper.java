package com.vankeytech.pmp.pms.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.pms.entity.PmsCommentaries;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
public interface PmsCommentariesMapper extends BasicMapper<PmsCommentaries> {
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsCommentaries> selectPmsCommentariesByconditions(@Param("map")Map<String,Object> map);

    /**
     * 关闭评论
     * @param id
     * @return
     */
    Integer updateAccordingStateById(@Param("id") Integer id);

    /**
     * 连表查询多个id
     * @param ids
     * @return
     */
    List<Map<String,Object>> selectAllByConcatenon(@Param("ids") List<Integer> ids);

    /**
     * 批量删除
     * @param idArray
     */
    void deleteSomeByIds(int[] idArray);

    /**
     * 批量新增
     * @param pmsList
     */
    void insertSome(@Param("pmsList") List<PmsCommentaries> pmsList);
}