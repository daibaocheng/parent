package com.vankeytech.pmp.auth;


import com.vankeytech.pmp.auth.entity.OperationLog;

import com.vankeytech.pmp.auth.service.OperationLogService;
import com.vankeytech.pmp.auth.util.DateKit;
import com.vankeytech.pmp.auth.util.poi.ExcelHandle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthApplicationTests {




	/**
	 * 单元测试前执行
	 */
	@Before
	public void  before(){

	}

	/**
	 * 单元测试后执行
	 */
	@After
	public void after(){
	}



    @Test
    public void tests(){

        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));
    }

    @Autowired
    private OperationLogService operationLogService;

    @Test
    public void password(){

		String tempFilePath = System.getProperty("user.dir").concat(
				"/templateExport.xlsx");
		String exportFilePath = System.getProperty("user.dir").concat(
				"/" + DateKit.getCurrentDate("yyyy-MM-dd") + ".xlsx");

		List<String> dataListCell = new ArrayList<String>();
		dataListCell.add("oerationName");
		dataListCell.add("areaName");
		dataListCell.add("moduleName");
		dataListCell.add("interfaceName");
		dataListCell.add("operationMethod");
		dataListCell.add("logMssage");
		dataListCell.add("plateNumber");
		dataListCell.add("operationResult");
	//	dataListCell.add("operationAt");

		OutputStream os = null;
		File file = null;
		try {
			ExcelHandle handle = new ExcelHandle();
			List<OperationLog> list=operationLogService.selectAll();
			handle.writeRecordListData(tempFilePath, dataListCell, list, 0);

			file = new File(exportFilePath);
			os = new FileOutputStream(file);
			// 写到输出流并关闭资源
			handle.writeAndClose(tempFilePath, os);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("导出失败");
		} finally {
			if (null != os) {
				try {
					os.flush();
					os.close();
				} catch (Exception e) {
				}
			}
		}

	}



}
