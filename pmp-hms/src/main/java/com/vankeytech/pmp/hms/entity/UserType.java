package com.vankeytech.pmp.hms.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hms_user_type")
public class UserType {
    /**
     * 用户类型编号
     */
    @Id
    @Column(name = "user_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userTypeId;

    /**
     * 住户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户类型名(0业主、1租客、2亲属、3商家)
     */
    @Column(name = "user_type_no")
    private Long userTypeNo;

    /**
     * 创建时间
     */
    @Column(name = "creat_time")
    private Date creatTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 最后更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 房东
     */
    private Long landlord;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取用户类型编号
     *
     * @return user_type_id - 用户类型编号
     */
    public Long getUserTypeId() {
        return userTypeId;
    }

    /**
     * 设置用户类型编号
     *
     * @param userTypeId 用户类型编号
     */
    public void setUserTypeId(Long userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * 获取住户编号
     *
     * @return user_id - 住户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置住户编号
     *
     * @param userId 住户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户类型名(0业主、1租客、2亲属、3商家)
     *
     * @return user_type_no - 用户类型名(0业主、1租客、2亲属、3商家)
     */
    public Long getUserTypeNo() {
        return userTypeNo;
    }

    /**
     * 设置用户类型名(0业主、1租客、2亲属、3商家)
     *
     * @param userTypeNo 用户类型名(0业主、1租客、2亲属、3商家)
     */
    public void setUserTypeNo(Long userTypeNo) {
        this.userTypeNo = userTypeNo;
    }

    /**
     * 获取创建时间
     *
     * @return creat_time - 创建时间
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置创建时间
     *
     * @param creatTime 创建时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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
     * 获取最后更新时间
     *
     * @return update_time - 最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最后更新时间
     *
     * @param updateTime 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取房东
     *
     * @return landlord - 房东
     */
    public Long getLandlord() {
        return landlord;
    }

    /**
     * 设置房东
     *
     * @param landlord 房东
     */
    public void setLandlord(Long landlord) {
        this.landlord = landlord;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}