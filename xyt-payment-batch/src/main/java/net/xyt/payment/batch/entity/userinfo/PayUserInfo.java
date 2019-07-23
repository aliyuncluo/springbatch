package net.xyt.payment.batch.entity.userinfo;

import java.util.Date;

public class PayUserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.pkid
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private Long pkid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.user_code
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String userCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.user_type
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.user_name
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.platform_code
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String platformCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.mch_user_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String mchUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.cert_type
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String certType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.cert_no
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String certNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.phone
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.user_status
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String userStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.create_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private Long createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.operator
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.create_time
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.modify_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private Long modifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.modifier
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String modifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.modify_time
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.modify_ip
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private String modifyIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_user_info.deleted
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    private Byte deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.pkid
     *
     * @return the value of pay_user_info.pkid
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public Long getPkid() {
        return pkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.pkid
     *
     * @param pkid the value for pay_user_info.pkid
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.user_code
     *
     * @return the value of pay_user_info.user_code
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.user_code
     *
     * @param userCode the value for pay_user_info.user_code
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.user_type
     *
     * @return the value of pay_user_info.user_type
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.user_type
     *
     * @param userType the value for pay_user_info.user_type
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.user_name
     *
     * @return the value of pay_user_info.user_name
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.user_name
     *
     * @param userName the value for pay_user_info.user_name
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.platform_code
     *
     * @return the value of pay_user_info.platform_code
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getPlatformCode() {
        return platformCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.platform_code
     *
     * @param platformCode the value for pay_user_info.platform_code
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode == null ? null : platformCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.mch_user_id
     *
     * @return the value of pay_user_info.mch_user_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getMchUserId() {
        return mchUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.mch_user_id
     *
     * @param mchUserId the value for pay_user_info.mch_user_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setMchUserId(String mchUserId) {
        this.mchUserId = mchUserId == null ? null : mchUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.cert_type
     *
     * @return the value of pay_user_info.cert_type
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getCertType() {
        return certType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.cert_type
     *
     * @param certType the value for pay_user_info.cert_type
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.cert_no
     *
     * @return the value of pay_user_info.cert_no
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.cert_no
     *
     * @param certNo the value for pay_user_info.cert_no
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.phone
     *
     * @return the value of pay_user_info.phone
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.phone
     *
     * @param phone the value for pay_user_info.phone
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.user_status
     *
     * @return the value of pay_user_info.user_status
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.user_status
     *
     * @param userStatus the value for pay_user_info.user_status
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.create_id
     *
     * @return the value of pay_user_info.create_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.create_id
     *
     * @param createId the value for pay_user_info.create_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.operator
     *
     * @return the value of pay_user_info.operator
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.operator
     *
     * @param operator the value for pay_user_info.operator
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.create_time
     *
     * @return the value of pay_user_info.create_time
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.create_time
     *
     * @param createTime the value for pay_user_info.create_time
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.modify_id
     *
     * @return the value of pay_user_info.modify_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public Long getModifyId() {
        return modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.modify_id
     *
     * @param modifyId the value for pay_user_info.modify_id
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.modifier
     *
     * @return the value of pay_user_info.modifier
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.modifier
     *
     * @param modifier the value for pay_user_info.modifier
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.modify_time
     *
     * @return the value of pay_user_info.modify_time
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.modify_time
     *
     * @param modifyTime the value for pay_user_info.modify_time
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.modify_ip
     *
     * @return the value of pay_user_info.modify_ip
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public String getModifyIp() {
        return modifyIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.modify_ip
     *
     * @param modifyIp the value for pay_user_info.modify_ip
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setModifyIp(String modifyIp) {
        this.modifyIp = modifyIp == null ? null : modifyIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_user_info.deleted
     *
     * @return the value of pay_user_info.deleted
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_user_info.deleted
     *
     * @param deleted the value for pay_user_info.deleted
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}