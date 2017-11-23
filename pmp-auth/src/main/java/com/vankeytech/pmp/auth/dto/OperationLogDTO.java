package com.vankeytech.pmp.auth.dto;

/**
 * @author  xieliang
 */
public class OperationLogDTO {

    /**
     * 操作人的登录名
     */

    private String userLogName;

    /**
     * 操作的小区
     */
    private String areaName;

    /**
     * 操作的子模块
     */
    private String moduleName;

    /**
     * 操作的接口
     */
    private String intefeceName;

    /**
     * 操作的方法
     */
    private String operadMethod;

    /**
     * 操作的内容
     */
    private String message;

    /**
     * 车牌号
     */
    private String plateNumber;

    /**
     * 操作结果
     */
    private String result;

    /**
     * 时间
     */
    private String createAt;

    /**
     * 查询时间 时间范围
     */
    private String startDate;

    /**
     * 结束时间
     */
    private String endDate;


    public String getUserLogName() {
        return userLogName;
    }

    public void setUserLogName(String userLogName) {
        this.userLogName = userLogName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getIntefeceName() {
        return intefeceName;
    }

    public void setIntefeceName(String intefeceName) {
        this.intefeceName = intefeceName;
    }

    public String getOperadMethod() {
        return operadMethod;
    }

    public void setOperadMethod(String operadMethod) {
        this.operadMethod = operadMethod;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "OperationLogDTO{" +
                "userLogName='" + userLogName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", intefeceName='" + intefeceName + '\'' +
                ", operadMethod='" + operadMethod + '\'' +
                ", message='" + message + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", result='" + result + '\'' +
                ", createAt='" + createAt + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
