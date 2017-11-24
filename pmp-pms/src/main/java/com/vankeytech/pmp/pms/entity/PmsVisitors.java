package com.vankeytech.pmp.pms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pms_visitors")
public class PmsVisitors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 访客
     */
    @Column(name = "visitors_name")
    private String visitorsName;

    /**
     * 被访人(住户外键)
     */
    @Column(name = "householders_id")
    private Integer householdersId;

    /**
     * 来访说明
     */
    @Column(name = "visiting_instructions")
    private String visitingInstructions;

    /**
     * 来访时间
     */
    @Column(name = "visiting_time")
    private Date visitingTime;

    /**
     * 离开时间
     */
    @Column(name = "leave_time")
    private Date leaveTime;

    /**
     * 访问状态，已离开0，未离开1
     */
    @Column(name = "access_state")
    private Integer accessState;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取访客
     *
     * @return visitors_name - 访客
     */
    public String getVisitorsName() {
        return visitorsName;
    }

    /**
     * 设置访客
     *
     * @param visitorsName 访客
     */
    public void setVisitorsName(String visitorsName) {
        this.visitorsName = visitorsName;
    }

    /**
     * 获取被访人(住户外键)
     *
     * @return householders_id - 被访人(住户外键)
     */
    public Integer getHouseholdersId() {
        return householdersId;
    }

    /**
     * 设置被访人(住户外键)
     *
     * @param householdersId 被访人(住户外键)
     */
    public void setHouseholdersId(Integer householdersId) {
        this.householdersId = householdersId;
    }

    /**
     * 获取来访说明
     *
     * @return visiting_instructions - 来访说明
     */
    public String getVisitingInstructions() {
        return visitingInstructions;
    }

    /**
     * 设置来访说明
     *
     * @param visitingInstructions 来访说明
     */
    public void setVisitingInstructions(String visitingInstructions) {
        this.visitingInstructions = visitingInstructions;
    }

    /**
     * 获取来访时间
     *
     * @return visiting_time - 来访时间
     */
    public Date getVisitingTime() {
        return visitingTime;
    }

    /**
     * 设置来访时间
     *
     * @param visitingTime 来访时间
     */
    public void setVisitingTime(Date visitingTime) {
        this.visitingTime = visitingTime;
    }

    /**
     * 获取离开时间
     *
     * @return leave_time - 离开时间
     */
    public Date getLeaveTime() {
        return leaveTime;
    }

    /**
     * 设置离开时间
     *
     * @param leaveTime 离开时间
     */
    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    /**
     * 获取访问状态，已离开0，未离开1
     *
     * @return access_state - 访问状态，已离开0，未离开1
     */
    public Integer getAccessState() {
        return accessState;
    }

    /**
     * 设置访问状态，已离开0，未离开1
     *
     * @param accessState 访问状态，已离开0，未离开1
     */
    public void setAccessState(Integer accessState) {
        this.accessState = accessState;
    }
}