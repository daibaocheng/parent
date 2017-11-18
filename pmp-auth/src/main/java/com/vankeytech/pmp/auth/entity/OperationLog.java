package com.vankeytech.pmp.auth.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "auth_operation_log")
public class OperationLog {
    /**
     * 操作日志的id编号
     */
    @Id
    @Column(name = "operation_log_id")
    private Long operationLogId;

    /**
     * 操作人员的用户名
     */
    @Column(name = "oeration_name")
    private String oerationName;

    /**
     * 操作的时间
     */
    @Column(name = "operation_at")
    private Date operationAt;

    /**
     * 操作的内容
     */
    @Column(name = "log_mssage")
    private String logMssage;

    /**
     * 操作的方法
     */
    @Column(name = "operation_method")
    private String operationMethod;

    /**
     * 操作结果 成功或失败
     */
    @Column(name = "operation_result")
    private String operationResult;

    /**
     * 所在小区
     */
    @Column(name = "area_name")
    private String areaName;

    /**
     * 车牌号
     */
    @Column(name = "plate_number")
    private String plateNumber;

    /**
     * 所操作的模块
     */
    @Column(name = "module_name")
    private String moduleName;

    /**
     * 操作属于哪个管理模块
     */
    @Column(name = "interface_name")
    private String interfaceName;

    /**
     * 日志导出时间
     */
    @Column(name = "exported_at")
    private Date exportedAt;

    /**
     * 获取操作日志的id编号
     *
     * @return operation_log_id - 操作日志的id编号
     */
    public Long getOperationLogId() {
        return operationLogId;
    }

    /**
     * 设置操作日志的id编号
     *
     * @param operationLogId 操作日志的id编号
     */
    public void setOperationLogId(Long operationLogId) {
        this.operationLogId = operationLogId;
    }

    /**
     * 获取操作人员的用户名
     *
     * @return oeration_name - 操作人员的用户名
     */
    public String getOerationName() {
        return oerationName;
    }

    /**
     * 设置操作人员的用户名
     *
     * @param oerationName 操作人员的用户名
     */
    public void setOerationName(String oerationName) {
        this.oerationName = oerationName;
    }

    /**
     * 获取操作的时间
     *
     * @return operation_at - 操作的时间
     */
    public Date getOperationAt() {
        return operationAt;
    }

    /**
     * 设置操作的时间
     *
     * @param operationAt 操作的时间
     */
    public void setOperationAt(Date operationAt) {
        this.operationAt = operationAt;
    }

    /**
     * 获取操作的内容
     *
     * @return log_mssage - 操作的内容
     */
    public String getLogMssage() {
        return logMssage;
    }

    /**
     * 设置操作的内容
     *
     * @param logMssage 操作的内容
     */
    public void setLogMssage(String logMssage) {
        this.logMssage = logMssage;
    }

    /**
     * 获取操作的方法
     *
     * @return operation_method - 操作的方法
     */
    public String getOperationMethod() {
        return operationMethod;
    }

    /**
     * 设置操作的方法
     *
     * @param operationMethod 操作的方法
     */
    public void setOperationMethod(String operationMethod) {
        this.operationMethod = operationMethod;
    }

    /**
     * 获取操作结果 成功或失败
     *
     * @return operation_result - 操作结果 成功或失败
     */
    public String getOperationResult() {
        return operationResult;
    }

    /**
     * 设置操作结果 成功或失败
     *
     * @param operationResult 操作结果 成功或失败
     */
    public void setOperationResult(String operationResult) {
        this.operationResult = operationResult;
    }

    /**
     * 获取所在小区
     *
     * @return area_name - 所在小区
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置所在小区
     *
     * @param areaName 所在小区
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 获取车牌号
     *
     * @return plate_number - 车牌号
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 设置车牌号
     *
     * @param plateNumber 车牌号
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * 获取所操作的模块
     *
     * @return module_name - 所操作的模块
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 设置所操作的模块
     *
     * @param moduleName 所操作的模块
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * 获取操作属于哪个管理模块
     *
     * @return interface_name - 操作属于哪个管理模块
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * 设置操作属于哪个管理模块
     *
     * @param interfaceName 操作属于哪个管理模块
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     * 获取日志导出时间
     *
     * @return exported_at - 日志导出时间
     */
    public Date getExportedAt() {
        return exportedAt;
    }

    /**
     * 设置日志导出时间
     *
     * @param exportedAt 日志导出时间
     */
    public void setExportedAt(Date exportedAt) {
        this.exportedAt = exportedAt;
    }
}