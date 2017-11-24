package com.vankeytech.pmp.pms.intf;


import com.vankeytech.pmp.pms.entity.PmsServiceManagement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;

/**
 * @author daibaocheng
 */
public interface PmsServiceManagementIntf{
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsServiceManagement> selectByconditions(Map<String,Object> map);
    /**
     * 查询所有报修信息
     * @return
     */
    List<PmsServiceManagement> selectAll() ;

    /**
     * 通过id查询报修信息
     * @param ids
     * @return
     */
    List<PmsServiceManagement> selectByIds(String ids);

    /**
     * 查询所有报修条数
     * @param pmsServiceManagement
     * @return
     */
    Integer selectCount(PmsServiceManagement pmsServiceManagement);

    /**
     * 增加单条报修
     * @param pmsServiceManagement
     * @return
     */
    Integer insertPmsServiceManagement(PmsServiceManagement pmsServiceManagement) ;

    /**
     * 增加多条报修
     * @param pmsServiceManagementList
     * @return
     */
    Integer insertPmsServiceManagementList(List<PmsServiceManagement> pmsServiceManagementList) ;

    /**
     * 修改单条报修
     * @param pmsServiceManagement
     * @return
     */
    Integer updatePmsServiceManagement(PmsServiceManagement pmsServiceManagement) ;

    /**
     * 通过主键删除报修信息
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(Integer id) ;

    /**
     * 通过主键删除多条报修信息
     * @param ids
     * @return
     */
    Integer deleteByIds(String ids) ;
}
