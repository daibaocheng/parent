package com.vankeytech.pmp.auth.dto;


import java.io.Serializable;

/**
 * @author  xieliang
 */
public class OvertimeDTO implements Serializable {

    /**
     * 值班表id
     */
    private Integer overtimeId;

    /**
     * 开始值班时间
     */
    private String  StartOvertime;

    /**
     * 结束值班时间
     */
    private String  endOvertime;

    /**
     * 值班人姓名
     */
    private String  overtimePerson;


    public void setOvertimeId(Integer overtimeId) {
        this.overtimeId = overtimeId;
    }

    public void setStartOvertime(String startOvertime) {
        StartOvertime = startOvertime;
    }

    public void setEndOvertime(String endOvertime) {
        this.endOvertime = endOvertime;
    }

    public void setOvertimePerson(String overtimePerson) {
        this.overtimePerson = overtimePerson;
    }

    @Override
    public String toString() {
        return "OvertimeDTO{" +
                "overtimeId=" + overtimeId +
                ", StartOvertime='" + StartOvertime + '\'' +
                ", endOvertime='" + endOvertime + '\'' +
                ", overtimePerson='" + overtimePerson + '\'' +
                '}';
    }
}
