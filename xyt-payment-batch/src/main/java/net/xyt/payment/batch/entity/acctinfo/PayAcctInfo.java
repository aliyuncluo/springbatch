package net.xyt.payment.batch.entity.acctinfo;

import java.math.BigDecimal;
import java.util.Date;

public class PayAcctInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.pkid
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private Long pkid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.ex_acct_no
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private String exAcctNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.ex_acct_name
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private String exAcctName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.ex_acct_type
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private String exAcctType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.open_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private Date openTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.acct_status
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private String acctStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.total_bal_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private BigDecimal totalBalAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.avi_bal_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private BigDecimal aviBalAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.avi_draw_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private BigDecimal aviDrawAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.user_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.create_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private Long createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.operator
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.create_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.modify_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private Long modifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.modifier
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private String modifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.modify_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.modify_ip
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private String modifyIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_acct_info.deleted
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    private Byte deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.pkid
     *
     * @return the value of pay_acct_info.pkid
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public Long getPkid() {
        return pkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.pkid
     *
     * @param pkid the value for pay_acct_info.pkid
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.ex_acct_no
     *
     * @return the value of pay_acct_info.ex_acct_no
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public String getExAcctNo() {
        return exAcctNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.ex_acct_no
     *
     * @param exAcctNo the value for pay_acct_info.ex_acct_no
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setExAcctNo(String exAcctNo) {
        this.exAcctNo = exAcctNo == null ? null : exAcctNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.ex_acct_name
     *
     * @return the value of pay_acct_info.ex_acct_name
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public String getExAcctName() {
        return exAcctName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.ex_acct_name
     *
     * @param exAcctName the value for pay_acct_info.ex_acct_name
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setExAcctName(String exAcctName) {
        this.exAcctName = exAcctName == null ? null : exAcctName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.ex_acct_type
     *
     * @return the value of pay_acct_info.ex_acct_type
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public String getExAcctType() {
        return exAcctType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.ex_acct_type
     *
     * @param exAcctType the value for pay_acct_info.ex_acct_type
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setExAcctType(String exAcctType) {
        this.exAcctType = exAcctType == null ? null : exAcctType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.open_time
     *
     * @return the value of pay_acct_info.open_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public Date getOpenTime() {
        return openTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.open_time
     *
     * @param openTime the value for pay_acct_info.open_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.acct_status
     *
     * @return the value of pay_acct_info.acct_status
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public String getAcctStatus() {
        return acctStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.acct_status
     *
     * @param acctStatus the value for pay_acct_info.acct_status
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus == null ? null : acctStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.total_bal_amt
     *
     * @return the value of pay_acct_info.total_bal_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public BigDecimal getTotalBalAmt() {
        return totalBalAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.total_bal_amt
     *
     * @param totalBalAmt the value for pay_acct_info.total_bal_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setTotalBalAmt(BigDecimal totalBalAmt) {
        this.totalBalAmt = totalBalAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.avi_bal_amt
     *
     * @return the value of pay_acct_info.avi_bal_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public BigDecimal getAviBalAmt() {
        return aviBalAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.avi_bal_amt
     *
     * @param aviBalAmt the value for pay_acct_info.avi_bal_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setAviBalAmt(BigDecimal aviBalAmt) {
        this.aviBalAmt = aviBalAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.avi_draw_amt
     *
     * @return the value of pay_acct_info.avi_draw_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public BigDecimal getAviDrawAmt() {
        return aviDrawAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.avi_draw_amt
     *
     * @param aviDrawAmt the value for pay_acct_info.avi_draw_amt
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setAviDrawAmt(BigDecimal aviDrawAmt) {
        this.aviDrawAmt = aviDrawAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.user_id
     *
     * @return the value of pay_acct_info.user_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.user_id
     *
     * @param userId the value for pay_acct_info.user_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.create_id
     *
     * @return the value of pay_acct_info.create_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.create_id
     *
     * @param createId the value for pay_acct_info.create_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.operator
     *
     * @return the value of pay_acct_info.operator
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.operator
     *
     * @param operator the value for pay_acct_info.operator
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.create_time
     *
     * @return the value of pay_acct_info.create_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.create_time
     *
     * @param createTime the value for pay_acct_info.create_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.modify_id
     *
     * @return the value of pay_acct_info.modify_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public Long getModifyId() {
        return modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.modify_id
     *
     * @param modifyId the value for pay_acct_info.modify_id
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.modifier
     *
     * @return the value of pay_acct_info.modifier
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.modifier
     *
     * @param modifier the value for pay_acct_info.modifier
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.modify_time
     *
     * @return the value of pay_acct_info.modify_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.modify_time
     *
     * @param modifyTime the value for pay_acct_info.modify_time
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.modify_ip
     *
     * @return the value of pay_acct_info.modify_ip
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public String getModifyIp() {
        return modifyIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.modify_ip
     *
     * @param modifyIp the value for pay_acct_info.modify_ip
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setModifyIp(String modifyIp) {
        this.modifyIp = modifyIp == null ? null : modifyIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_acct_info.deleted
     *
     * @return the value of pay_acct_info.deleted
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_acct_info.deleted
     *
     * @param deleted the value for pay_acct_info.deleted
     *
     * @mbg.generated Thu Jun 20 15:14:52 CST 2019
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}