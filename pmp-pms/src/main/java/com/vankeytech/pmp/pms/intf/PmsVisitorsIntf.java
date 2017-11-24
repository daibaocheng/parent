package com.vankeytech.pmp.pms.intf;


import com.vankeytech.pmp.pms.entity.PmsVisitors;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;

/**
 * @author daibaocheng
 */
public interface PmsVisitorsIntf{
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsVisitors> selectPmsVisitorsByCondition(Map<String,Object> map);
    /**
     * 查询所有访客信息
     * @return
     */
    List<PmsVisitors> selectAll() ;

    /**
     * 通过id查询访客信息
     * @param ids
     * @return
     */
    List<PmsVisitors> selectByIds(String ids);

    /**
     * 查询所有访客信息条数
     * @param pmsVisitors
     * @return
     */
    Integer selectCount(PmsVisitors pmsVisitors);

    /**
     * 增加单条访客信息
     * @param pmsVisitors
     * @return
     */
    Integer insertPmsVisitors(PmsVisitors pmsVisitors) ;

    /**
     * 增加多条访客信息
     * @param pmsVisitorsList
     * @return
     */
    Integer insertPmsVisitorsList(List<PmsVisitors> pmsVisitorsList) ;

    /**
     * 修改单条访客信息
     * @param pmsVisitors
     * @return
     */
    Integer updatePmsVisitors(PmsVisitors pmsVisitors) ;

    /**
     * 通过主键删除访客信息
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(Integer id) ;

    /**
     * 通过主键删除多条访客信息
     * @param ids
     * @return
     */
    Integer deleteByIds(String ids) ;
}
