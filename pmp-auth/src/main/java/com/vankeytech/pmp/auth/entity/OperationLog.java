package com.vankeytech.pmp.auth.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pmp_operation_log")
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
     * 操作结果 成功和失败
     */
    @Column(name = "operation_result")
    private String operationResult;

    /**
     * 所在小区
     */
    @Column(name = "area_name")
    private String areaName;

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
     * 获取操作结果 成功和失败
     *
     * @return operation_result - 操作结果 成功和失败
     */
    public String getOperationResult() {
        return operationResult;
    }

    /**
     * 设置操作结果 成功和失败
     *
     * @param operationResult 操作结果 成功和失败
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
}