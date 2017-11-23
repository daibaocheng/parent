package com.vankeytech.pmp.auth.intf;

import com.vankeytech.pmp.auth.entity.Overtime;

import java.util.List;

/**
 * @author  xieliang
 */
public interface OvertimeIntf {

    /**
     * 新增值班信息
     * @param overtime
     */
    void insert(Overtime overtime);

    /**
     * 修改值班表信息
     * @param overtime
     */
    void updateOvertime(Overtime overtime);

    /**
     * 删除值班人员信息
     * @param overtime
     */
    void  delectOvertime(Overtime overtime);

    /**
     * 获取所有值班表信息
     * @return
     */
    List<Overtime> getOvertimeAll();

}
