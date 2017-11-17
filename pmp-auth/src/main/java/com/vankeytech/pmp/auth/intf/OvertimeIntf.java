package com.vankeytech.pmp.auth.intf;

import com.vankeytech.pmp.auth.entity.Overtime;

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
     * @param overtimeId
     */
    void  delectOvertime(Integer overtimeId);


}
