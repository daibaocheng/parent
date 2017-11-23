package com.vankeytech.pmp.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_parking_record")
public class ParkingRecord implements Serializable {
    /**
     * 停车记录ID
     */
    @Id
    private Integer id;

    /**
     * 车辆ID
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 进停车场的时间
     */
    @Column(name = "in_time")
    private Date inTime;

    /**
     * 出停车场的时间
     */
    @Column(name = "out_time")
    private Date outTime;

    /**
     * 进停车场的图像
     */
    @Column(name = "in_image")
    private String inImage;

    /**
     * 出停车场的图像
     */
    @Column(name = "out_image")
    private String outImage;

    /**
     * 进停车场的岗亭
     */
    @Column(name = "in_sentry_booth_id")
    private Integer inSentryBoothId;

    /**
     * 出停车场的岗亭
     */
    @Column(name = "out_sentry_booth_id")
    private Integer outSentryBoothId;

    /**
     * 获取停车记录ID
     *
     * @return id - 停车记录ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置停车记录ID
     *
     * @param id 停车记录ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取车辆ID
     *
     * @return car_id - 车辆ID
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置车辆ID
     *
     * @param carId 车辆ID
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取进停车场的时间
     *
     * @return in_time - 进停车场的时间
     */
    public Date getInTime() {
        return inTime;
    }

    /**
     * 设置进停车场的时间
     *
     * @param inTime 进停车场的时间
     */
    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    /**
     * 获取出停车场的时间
     *
     * @return out_time - 出停车场的时间
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * 设置出停车场的时间
     *
     * @param outTime 出停车场的时间
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * 获取进停车场的图像
     *
     * @return in_image - 进停车场的图像
     */
    public String getInImage() {
        return inImage;
    }

    /**
     * 设置进停车场的图像
     *
     * @param inImage 进停车场的图像
     */
    public void setInImage(String inImage) {
        this.inImage = inImage;
    }

    /**
     * 获取出停车场的图像
     *
     * @return out_image - 出停车场的图像
     */
    public String getOutImage() {
        return outImage;
    }

    /**
     * 设置出停车场的图像
     *
     * @param outImage 出停车场的图像
     */
    public void setOutImage(String outImage) {
        this.outImage = outImage;
    }

    /**
     * 获取进停车场的岗亭
     *
     * @return in_sentry_booth_id - 进停车场的岗亭
     */
    public Integer getInSentryBoothId() {
        return inSentryBoothId;
    }

    /**
     * 设置进停车场的岗亭
     *
     * @param inSentryBoothId 进停车场的岗亭
     */
    public void setInSentryBoothId(Integer inSentryBoothId) {
        this.inSentryBoothId = inSentryBoothId;
    }

    /**
     * 获取出停车场的岗亭
     *
     * @return out_sentry_booth_id - 出停车场的岗亭
     */
    public Integer getOutSentryBoothId() {
        return outSentryBoothId;
    }

    /**
     * 设置出停车场的岗亭
     *
     * @param outSentryBoothId 出停车场的岗亭
     */
    public void setOutSentryBoothId(Integer outSentryBoothId) {
        this.outSentryBoothId = outSentryBoothId;
    }

    @Override
    public String toString() {
        return "ParkingRecord{" +
                "id=" + id +
                ", carId=" + carId +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                ", inImage='" + inImage + '\'' +
                ", outImage='" + outImage + '\'' +
                ", inSentryBoothId=" + inSentryBoothId +
                ", outSentryBoothId=" + outSentryBoothId +
                '}';
    }
}