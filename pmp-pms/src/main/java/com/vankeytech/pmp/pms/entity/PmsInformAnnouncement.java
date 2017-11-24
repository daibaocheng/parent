package com.vankeytech.pmp.pms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * @author daibaocheng
 */
@Table(name = "pms_inform_announcement")
public class PmsInformAnnouncement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 摘要
     */
    private String abstracts;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 创建人
     */
    private String founder;

    /**
     * 创建时间
     */
    @Column(name = "creation_time")
    private Date creationTime;

    /**
     * 开始发布时间
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     * 结束发布时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 公告类型，维修通知0，水电煤气1，安全提醒2，公益服务3，温馨提示4，紧急通知5，物业费通知单6，其他7
     */
    private Integer type;

    /**
     * 是否推送，是0，否1
     */
    private Integer ispush;

    /**
     * 公告状态，已发布0，未发布1
     */
    private Integer state;

    /**
     * 图片地址
     */
    @Column(name = "picture_url")
    private String pictureUrl;

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
     * 获取公告标题
     *
     * @return title - 公告标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置公告标题
     *
     * @param title 公告标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取摘要
     *
     * @return abstracts - 摘要
     */
    public String getAbstracts() {
        return abstracts;
    }

    /**
     * 设置摘要
     *
     * @param abstracts 摘要
     */
    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    /**
     * 获取公告内容
     *
     * @return content - 公告内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置公告内容
     *
     * @param content 公告内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取创建人
     *
     * @return founder - 创建人
     */
    public String getFounder() {
        return founder;
    }

    /**
     * 设置创建人
     *
     * @param founder 创建人
     */
    public void setFounder(String founder) {
        this.founder = founder;
    }

    /**
     * 获取创建时间
     *
     * @return creation_time - 创建时间
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置创建时间
     *
     * @param creationTime 创建时间
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取开始发布时间
     *
     * @return begin_time - 开始发布时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置开始发布时间
     *
     * @param beginTime 开始发布时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取结束发布时间
     *
     * @return end_time - 结束发布时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束发布时间
     *
     * @param endTime 结束发布时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取公告类型，维修通知0，水电煤气1，安全提醒2，公益服务3，温馨提示4，紧急通知5，物业费通知单6，其他7
     *
     * @return type - 公告类型，维修通知0，水电煤气1，安全提醒2，公益服务3，温馨提示4，紧急通知5，物业费通知单6，其他7
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置公告类型，维修通知0，水电煤气1，安全提醒2，公益服务3，温馨提示4，紧急通知5，物业费通知单6，其他7
     *
     * @param type 公告类型，维修通知0，水电煤气1，安全提醒2，公益服务3，温馨提示4，紧急通知5，物业费通知单6，其他7
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取是否推送，是0，否1
     *
     * @return ispush - 是否推送，是0，否1
     */
    public Integer getIspush() {
        return ispush;
    }

    /**
     * 设置是否推送，是0，否1
     *
     * @param ispush 是否推送，是0，否1
     */
    public void setIspush(Integer ispush) {
        this.ispush = ispush;
    }

    /**
     * 获取公告状态，已发布0，未发布1
     *
     * @return state - 公告状态，已发布0，未发布1
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置公告状态，已发布0，未发布1
     *
     * @param state 公告状态，已发布0，未发布1
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取图片地址
     * @return
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 设置图片地址
     * @param pictureUrl
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}