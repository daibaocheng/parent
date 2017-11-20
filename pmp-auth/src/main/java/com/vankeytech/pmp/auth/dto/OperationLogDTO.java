package com.vankeytech.pmp.auth.dto;

/**
 *@author xieliang
 */
public class OperationLogDTO {

    /**
     * 小区名称
     */
    private String  areaName;

    /**
     * 开始时间
     */
    private String startDate;
    /**
     * 结束时间
     */
    private String endDate;
    /**
     * 模块名称
     */
    private String modelName;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 车牌号
     */


    private String plateNumber;

    public String getAreaName() {
        return areaName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getModelName() {
        return modelName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
