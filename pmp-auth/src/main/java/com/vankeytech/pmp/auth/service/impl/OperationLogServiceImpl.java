package com.vankeytech.pmp.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.auth.entity.OperationLog;
import com.vankeytech.pmp.auth.mapper.OperationLogMapper;
import com.vankeytech.pmp.auth.service.OperationLogService;
import com.vankeytech.pmp.auth.util.poi.ExcelHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xieliang
 */
@Service
public class OperationLogServiceImpl extends BaseService<OperationLog> implements OperationLogService {

    public OperationLogServiceImpl(OperationLogMapper operationLogMapper) {
        super(operationLogMapper);
    }

    @Autowired
    private OperationLogMapper operationLogMapper;

    /**
     * 添加日志
     *
     * @param operationLog
     */
    @Override
    public void addLog(OperationLog operationLog) {
        operationLogMapper.insert(operationLog);
    }

    /**
     * 查询并分页
     * @param page
     * @param pageSize
     * @param operationLog
     * @return
     */
    @Override
    public PageInfo<OperationLog> selectPage(Integer page, Integer pageSize, OperationLog operationLog) {
        List<OperationLog> operationLogs=null;

        if(operationLog == null){
            operationLogs=operationLogMapper.selectAll();
        }else{
            Condition condition = new Condition(operationLog.getClass());
            condition.and().andEqualTo("areaName",operationLog.getAreaName())
                     .andBetween("operationAt",operationLog.getStartTime(),operationLog.getEndTime())
                     .andEqualTo("moduleName", operationLog.getModuleName())
                     .andEqualTo("oerationName", operationLog.getOerationName())
                     .andEqualTo("plateNumber", operationLog.getPlateNumber());
            operationLogs=operationLogMapper.selectByCondition(condition);
        }
        PageHelper.startPage(page,pageSize);
        PageInfo<OperationLog> pageInfo = new PageInfo<OperationLog>(operationLogs);
        return pageInfo;
    }

    @Override
    public void exportLogExcel() {

        String tempFilePath = System.getProperty("user.dir").concat(
				"/templateExport.xlsx");
		String exportFilePath = System.getProperty("user.dir").concat(
				"/" + "operationLog.xlsx");
		List<String> dataListCell = new ArrayList<String>();
		dataListCell.add("oerationName");
		dataListCell.add("areaName");
		dataListCell.add("moduleName");
		dataListCell.add("interfaceName");
		dataListCell.add("operationMethod");
		dataListCell.add("logMssage");
		dataListCell.add("plateNumber");
		dataListCell.add("operationResult");
		dataListCell.add("operationAt");

		OutputStream os = null;
		File file = null;

		try {
			ExcelHandle handle = new ExcelHandle();
			List<OperationLog> list=this.selectAll();

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
