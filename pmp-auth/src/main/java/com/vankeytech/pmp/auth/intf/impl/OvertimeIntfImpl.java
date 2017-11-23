package com.vankeytech.pmp.auth.intf.impl;

import com.vankeytech.pmp.auth.entity.Overtime;
import com.vankeytech.pmp.auth.intf.OvertimeIntf;
import com.vankeytech.pmp.auth.service.OvertimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author  xieliang
 */
@Service
public class OvertimeIntfImpl implements OvertimeIntf{

    @Autowired
    private OvertimeService overtimeService;

    @Override
    public void insert(Overtime overtime) {
            overtimeService.insert(overtime);
    }

    @Override
    public void updateOvertime(Overtime overtime) {
        overtimeService.updateByPrimaryKeySelective(overtime);
    }

    @Override
    public void delectOvertime(Overtime overtime) {
            overtimeService.delete(overtime);
    }

    /**
     * 获取所有值班表信息
     *
     * @return
     */
    @Override
    public List<Overtime> getOvertimeAll() {

        return overtimeService.selectAll();
    }
}
