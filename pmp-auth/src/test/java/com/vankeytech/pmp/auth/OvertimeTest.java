package com.vankeytech.pmp.auth;


import com.vankeytech.pmp.auth.entity.Overtime;
import com.vankeytech.pmp.auth.intf.OvertimeIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OvertimeTest {


    @Autowired
    private OvertimeIntf overtimeIntf;



    @Test
    public void addOvertime(){
        Overtime overtime = new Overtime();
        overtime.setEndTime(new Date());
        overtime.setStartTime(new Date());
        overtime.setOvertimePersonnel("zhangshan");
        overtimeIntf.insert(overtime);
    }

    @Test
    public void updateOvertime(){
        Overtime overtime = new Overtime();
        overtime.setOvertimeId(1L);
        overtime.setEndTime(new Date());
        overtime.setStartTime(new Date());
        overtime.setOvertimePersonnel("wangwu");
        overtimeIntf.updateOvertime(overtime);
    }

    @Test
    public void deleteOvertime(){
        Overtime overtime = new Overtime();
        overtime.setOvertimeId(1L);
        overtimeIntf.delectOvertime(overtime);
    }

    @Test
    public void getOvertimes(){

        List<Overtime> list= overtimeIntf.getOvertimeAll();
        for (Overtime overtime : list){
            System.out.println(overtime.getOvertimePersonnel());
        }
    }


}
