package com.vankeytech.pmp.auth;


import com.vankeytech.pmp.auth.service.OperationLogService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthApplicationTests {

	/**
	 * 单元测试前执行
	 */
	@Before
	public void  before(){}

	/**
	 * 单元测试后执行
	 */
	@After
	public void after(){}

    @Autowired
    private OperationLogService operationLogService;

    @Test
    public void password(){
    	operationLogService.exportLogExcel();

	}

}
