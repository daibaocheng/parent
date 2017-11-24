package com.vankeytech.pmp.auth.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author  xieliang
 */
@Table(name = "auth_overtime")
public class Overtime implements Serializable {
    /**
     * 值班表id
     */
    @Id
    @Column(name = "overtime_id")
    private Long overtimeId;

    /**
     * 值班开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 值班人员
     */
    @Column(name = "overtime_personnel")
    private String overtimePersonnel;

    /**
     * 获取值班表id
     *
     * @return overtime - 值班表id
     */
    public Long getOvertimeId() {
        return overtimeId;
    }

    /**
     * 设置值班表id
     *
     * @param overtimeId 值班表id
     */
    public void setOvertimeId(Long overtimeId) {
        this.overtimeId = overtimeId;
    }

    /**
     * 获取值班开始时间
     *
     * @return start_time - 值班开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置值班开始时间
     *
     * @param startTime 值班开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取值班人员
     *
     * @return overtime_personnel - 值班人员
     */
    public String getOvertimePersonnel() {
        return overtimePersonnel;
    }

    /**
     * 设置值班人员
     *
     * @param overtimePersonnel 值班人员
     */
    public void setOvertimePersonnel(String overtimePersonnel) {
        this.overtimePersonnel = overtimePersonnel;
    }
}