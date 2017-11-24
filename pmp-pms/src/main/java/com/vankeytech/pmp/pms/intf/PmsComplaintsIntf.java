package com.vankeytech.pmp.pms.intf;


import com.vankeytech.pmp.pms.entity.PmsComplaints;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;

/**
 * @author daibaocheng
 */
public interface PmsComplaintsIntf{
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsComplaints> selectByconditions(Map<String,Object> map);
    /**
     * 查询所有投诉信息
     * @return
     */
    List<PmsComplaints> selectAll() ;

    /**
     * 通过id查询投诉信息
     * @param ids
     * @return
     */
    List<PmsComplaints> selectByIds(String ids);

    /**
     * 查询所有投诉条数
     * @param pmsComplaints
     * @return
     */
    Integer selectCount(PmsComplaints pmsComplaints);

    /**
     * 增加单条投诉
     * @param pmsComplaints
     * @return
     */
    Integer insertPmsComplaints(PmsComplaints pmsComplaints) ;

    /**
     * 增加多条投诉
     * @param pmsComplaintsList
     * @return
     */
    Integer insertPmsComplaintsList(List<PmsComplaints> pmsComplaintsList) ;

    /**
     * 修改单条投诉
     * @param pmsComplaints
     * @return
     */
    Integer updatePmsComplaints(PmsComplaints pmsComplaints) ;

    /**
     * 通过主键删除单条投诉
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(Integer id) ;

    /**
     * 通过主键删除多条投诉
     * @param ids
     * @return
     */
    Integer deleteByIds(String ids) ;

}
