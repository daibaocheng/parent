package com.vankeytech.pmp.hms.entity;

import javax.persistence.*;

@Table(name = "hms_user")
public class User {
    /**
     * 住户编号
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 账号ID
     */
    @Column(name = "account_no")
    private Long accountNo;

    /**
     * 性别
     */
    private Long sex;

    /**
     * 民族
     */
    private String nationality;

    /**
     * 籍贯
     */
    @Column(name = "native_place")
    private String nativePlace;

    /**
     * 户籍地址
     */
    @Column(name = "permanent_address")
    private String permanentAddress;

    /**
     * 身份证号
     */
    @Column(name = "identity_card")
    private String identityCard;

    /**
     * 手机号1
     */
    private String phone1;

    /**
     * 手机号2
     */
    private String phone2;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 房产证编号
     */
    @Column(name = "house_proprietary_certificate")
    private String houseProprietaryCertificate;

    /**
     * 公司名
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 公司职位
     */
    private String post;

    /**
     * 公司地址
     */
    @Column(name = "company_address")
    private String companyAddress;

    /**
     * 身份证正面照片地址
     */
    @Column(name = "identity_card_photo_obverse")
    private String identityCardPhotoObverse;

    /**
     * 身份证背面照片地址
     */
    @Column(name = "identity_card_photo_reverse")
    private String identityCardPhotoReverse;

    /**
     * 人脸照片地址
     */
    @Column(name = "face_photo")
    private String facePhoto;

    /**
     * 房东
     */
    private Long landlord;

    /**
     * 是否显示（软删除：0删除、1未删除）
     */
    private Long display;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取住户编号
     *
     * @return user_id - 住户编号
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置住户编号
     *
     * @param userId 住户编号
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取姓名
     *
     * @return user_name - 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     *
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取账号ID
     *
     * @return account_no - 账号ID
     */
    public Long getAccountNo() {
        return accountNo;
    }

    /**
     * 设置账号ID
     *
     * @param accountNo 账号ID
     */
    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Long getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Long sex) {
        this.sex = sex;
    }

    /**
     * 获取民族
     *
     * @return nationality - 民族
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置民族
     *
     * @param nationality 民族
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * 获取籍贯
     *
     * @return native_place - 籍贯
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * 设置籍贯
     *
     * @param nativePlace 籍贯
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    /**
     * 获取户籍地址
     *
     * @return permanent_address - 户籍地址
     */
    public String getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * 设置户籍地址
     *
     * @param permanentAddress 户籍地址
     */
    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    /**
     * 获取身份证号
     *
     * @return identity_card - 身份证号
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * 设置身份证号
     *
     * @param identityCard 身份证号
     */
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    /**
     * 获取手机号1
     *
     * @return phone1 - 手机号1
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * 设置手机号1
     *
     * @param phone1 手机号1
     */
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    /**
     * 获取手机号2
     *
     * @return phone2 - 手机号2
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * 设置手机号2
     *
     * @param phone2 手机号2
     */
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取房产证编号
     *
     * @return house_proprietary_certificate - 房产证编号
     */
    public String getHouseProprietaryCertificate() {
        return houseProprietaryCertificate;
    }

    /**
     * 设置房产证编号
     *
     * @param houseProprietaryCertificate 房产证编号
     */
    public void setHouseProprietaryCertificate(String houseProprietaryCertificate) {
        this.houseProprietaryCertificate = houseProprietaryCertificate;
    }

    /**
     * 获取公司名
     *
     * @return company_name - 公司名
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名
     *
     * @param companyName 公司名
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取公司职位
     *
     * @return post - 公司职位
     */
    public String getPost() {
        return post;
    }

    /**
     * 设置公司职位
     *
     * @param post 公司职位
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * 获取公司地址
     *
     * @return company_address - 公司地址
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置公司地址
     *
     * @param companyAddress 公司地址
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * 获取身份证正面照片地址
     *
     * @return identity_card_photo_obverse - 身份证正面照片地址
     */
    public String getIdentityCardPhotoObverse() {
        return identityCardPhotoObverse;
    }

    /**
     * 设置身份证正面照片地址
     *
     * @param identityCardPhotoObverse 身份证正面照片地址
     */
    public void setIdentityCardPhotoObverse(String identityCardPhotoObverse) {
        this.identityCardPhotoObverse = identityCardPhotoObverse;
    }

    /**
     * 获取身份证背面照片地址
     *
     * @return identity_card_photo_reverse - 身份证背面照片地址
     */
    public String getIdentityCardPhotoReverse() {
        return identityCardPhotoReverse;
    }

    /**
     * 设置身份证背面照片地址
     *
     * @param identityCardPhotoReverse 身份证背面照片地址
     */
    public void setIdentityCardPhotoReverse(String identityCardPhotoReverse) {
        this.identityCardPhotoReverse = identityCardPhotoReverse;
    }

    /**
     * 获取人脸照片地址
     *
     * @return face_photo - 人脸照片地址
     */
    public String getFacePhoto() {
        return facePhoto;
    }

    /**
     * 设置人脸照片地址
     *
     * @param facePhoto 人脸照片地址
     */
    public void setFacePhoto(String facePhoto) {
        this.facePhoto = facePhoto;
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
     * 获取是否显示（软删除：0删除、1未删除）
     *
     * @return display - 是否显示（软删除：0删除、1未删除）
     */
    public Long getDisplay() {
        return display;
    }

    /**
     * 设置是否显示（软删除：0删除、1未删除）
     *
     * @param display 是否显示（软删除：0删除、1未删除）
     */
    public void setDisplay(Long display) {
        this.display = display;
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