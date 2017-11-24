package com.vankeytech.pmp.auth;


import com.github.pagehelper.PageInfo;
import com.vankeytech.pmp.auth.entity.OperationLog;
import com.vankeytech.pmp.auth.intf.OperationLogIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationInfoTest {

    @Autowired
    private OperationLogIntf operationLogIntf;




    @Test
    public void insertLog(){
        OperationLog operationLog = new OperationLog();
        operationLog.setAreaName("纽约小区");
        operationLog.setInterfaceName("组织管理");
        operationLog.setLogMssage("我就这么操作的");
        operationLog.setModuleName("系统管理");
        operationLog.setOerationName("wangwu");
        operationLog.setOperationAt(new Date());
        operationLog.setOperationMethod("导出日志");
        operationLog.setOperationResult("成功");
        operationLog.setPlateNumber("0123154");
        operationLogIntf.insertLog(operationLog);
        System.out.println(operationLog.getOperationLogId()+"-------------------------------");

    }

    @Test
    public void getLog(){
        OperationLog odto = new OperationLog();
        odto.setAreaName("化小小区");
        PageInfo<OperationLog> pageInfo= operationLogIntf.pageSelect(1,4, odto);

        for(OperationLog ol:pageInfo.getList()){
            System.out.println(ol.getAreaName());
        }


    }
}
