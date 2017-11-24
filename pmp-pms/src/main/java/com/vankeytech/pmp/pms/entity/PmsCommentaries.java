package com.vankeytech.pmp.pms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * @author daibaocheng
 */
@Table(name = "pms_commentaries")
public class PmsCommentaries implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 评论用户外键，多对一
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 接收方姓名
     */
    @Column(name = "reception_name")
    private String receptionName;

    /**
     * 显示状态，显示0，未显示1
     */
    @Column(name = "according_state")
    private Integer accordingState;

    /**
     * 回复状态，已回复0，未回复1
     */
    @Column(name = "reply_state")
    private Integer replyState;

    /**
     * 事项类型，公告0，报修1，投诉2
     */
    @Column(name = "ltem_type")
    private Integer ltemType;

    /**
     * 详细类容
     */
    @Column(name = "detailed_content")
    private String detailedContent;

    /**
     * 评论时间
     */
    @Column(name = "comment_time")
    private Date commentTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取评论用户外键，多对一
     *
     * @return user_id - 评论用户外键，多对一
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置评论用户外键，多对一
     *
     * @param userId 评论用户外键，多对一
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取接收方姓名
     *
     * @return reception_name - 接收方姓名
     */
    public String getReceptionName() {
        return receptionName;
    }

    /**
     * 设置接收方姓名
     *
     * @param receptionName 接收方姓名
     */
    public void setReceptionName(String receptionName) {
        this.receptionName = receptionName;
    }

    /**
     * 获取显示状态，显示0，未显示1
     *
     * @return according_state - 显示状态，显示0，未显示1
     */
    public Integer getAccordingState() {
        return accordingState;
    }

    /**
     * 设置显示状态，显示0，未显示1
     *
     * @param accordingState 显示状态，显示0，未显示1
     */
    public void setAccordingState(Integer accordingState) {
        this.accordingState = accordingState;
    }

    /**
     * 获取回复状态，已回复0，未回复1
     *
     * @return reply_state - 回复状态，已回复0，未回复1
     */
    public Integer getReplyState() {
        return replyState;
    }

    /**
     * 设置回复状态，已回复0，未回复1
     *
     * @param replyState 回复状态，已回复0，未回复1
     */
    public void setReplyState(Integer replyState) {
        this.replyState = replyState;
    }

    /**
     * 获取事项类型，公告0，报修1，投诉2
     *
     * @return ltem_type - 事项类型，公告0，报修1，投诉2
     */
    public Integer getLtemType() {
        return ltemType;
    }

    /**
     * 设置事项类型，公告0，报修1，投诉2
     *
     * @param ltemType 事项类型，公告0，报修1，投诉2
     */
    public void setLtemType(Integer ltemType) {
        this.ltemType = ltemType;
    }

    /**
     * 获取详细类容
     *
     * @return detailed_content - 详细类容
     */
    public String getDetailedContent() {
        return detailedContent;
    }

    /**
     * 设置详细类容
     *
     * @param detailedContent 详细类容
     */
    public void setDetailedContent(String detailedContent) {
        this.detailedContent = detailedContent;
    }

    /**
     * 获取评论时间
     *
     * @return comment_time - 评论时间
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * 设置评论时间
     *
     * @param commentTime 评论时间
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}