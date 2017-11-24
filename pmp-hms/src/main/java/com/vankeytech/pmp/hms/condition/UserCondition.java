package com.vankeytech.pmp.hms.condition;

/**
 * @author Administrator
 */
public class UserCondition {

    private Long buildingNo;
    private Long unitNo;
    private Long roomNo;
    private Long userTypeNo;
    private Long authorityStatus;
    private String phone;
    private String identityCard;
    private String userName;

    public UserCondition() {
    }

    public UserCondition(Long buildingNo, Long unitNo, Long userTypeNo, Long authorityStatus, String phone, String identityCard, String userName) {
        this.buildingNo = buildingNo;
        this.unitNo = unitNo;
        this.userTypeNo = userTypeNo;
        this.authorityStatus = authorityStatus;
        this.phone = phone;
        this.identityCard = identityCard;
        this.userName = userName;
    }

    public Long getBuildingNo() {
        return buildingNo;
    }

    public Long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Long roomNo) {
        this.roomNo = roomNo;
    }

    public void setBuildingNo(Long buildingNo) {
        this.buildingNo = buildingNo;
    }

    public Long getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(Long unitNo) {
        this.unitNo = unitNo;
    }

    public Long getUserTypeNo() {
        return userTypeNo;
    }

    public void setUserTypeNo(Long userTypeNo) {
        this.userTypeNo = userTypeNo;
    }

    public Long getAuthorityStatus() {
        return authorityStatus;
    }

    public void setAuthorityStatus(Long authorityStatus) {
        this.authorityStatus = authorityStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone1(String phone1) {
        this.phone = phone;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserCondition{" +
                "buildingNo=" + buildingNo +
                ", unitNo=" + unitNo +
                ", roomNo=" + roomNo +
                ", userTypeNo=" + userTypeNo +
                ", authorityStatus=" + authorityStatus +
                ", phone='" + phone + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
