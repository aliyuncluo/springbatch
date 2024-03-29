package net.xyt.payment.batch.entity.withdraw;

import java.math.BigDecimal;
import java.util.Date;

public class PayWithdrawRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.pkid
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private Long pkid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.flow_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String flowNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.order_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.platform_code
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String platformCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.ex_acct_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String exAcctNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.withdraw_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private Date withdrawTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.withdraw_amt
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private BigDecimal withdrawAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.fee_amt
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private BigDecimal feeAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.fee_rate
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private BigDecimal feeRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.bank_acct_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String bankAcctNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.bank_acct_name
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String bankAcctName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.bank_code
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String bankCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.trade_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String tradeNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.trade_status
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String tradeStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.clear_flag
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private Integer clearFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.create_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private Long createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.operator
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.create_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.modify_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private Long modifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.modifier
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String modifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.modify_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.modify_ip
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private String modifyIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay_withdraw_record.deleted
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    private Byte deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.pkid
     *
     * @return the value of pay_withdraw_record.pkid
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public Long getPkid() {
        return pkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.pkid
     *
     * @param pkid the value for pay_withdraw_record.pkid
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.flow_no
     *
     * @return the value of pay_withdraw_record.flow_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getFlowNo() {
        return flowNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.flow_no
     *
     * @param flowNo the value for pay_withdraw_record.flow_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo == null ? null : flowNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.order_id
     *
     * @return the value of pay_withdraw_record.order_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.order_id
     *
     * @param orderId the value for pay_withdraw_record.order_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.platform_code
     *
     * @return the value of pay_withdraw_record.platform_code
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getPlatformCode() {
        return platformCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.platform_code
     *
     * @param platformCode the value for pay_withdraw_record.platform_code
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode == null ? null : platformCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.ex_acct_no
     *
     * @return the value of pay_withdraw_record.ex_acct_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getExAcctNo() {
        return exAcctNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.ex_acct_no
     *
     * @param exAcctNo the value for pay_withdraw_record.ex_acct_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setExAcctNo(String exAcctNo) {
        this.exAcctNo = exAcctNo == null ? null : exAcctNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.withdraw_time
     *
     * @return the value of pay_withdraw_record.withdraw_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public Date getWithdrawTime() {
        return withdrawTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.withdraw_time
     *
     * @param withdrawTime the value for pay_withdraw_record.withdraw_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.withdraw_amt
     *
     * @return the value of pay_withdraw_record.withdraw_amt
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public BigDecimal getWithdrawAmt() {
        return withdrawAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.withdraw_amt
     *
     * @param withdrawAmt the value for pay_withdraw_record.withdraw_amt
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setWithdrawAmt(BigDecimal withdrawAmt) {
        this.withdrawAmt = withdrawAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.fee_amt
     *
     * @return the value of pay_withdraw_record.fee_amt
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.fee_amt
     *
     * @param feeAmt the value for pay_withdraw_record.fee_amt
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.fee_rate
     *
     * @return the value of pay_withdraw_record.fee_rate
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.fee_rate
     *
     * @param feeRate the value for pay_withdraw_record.fee_rate
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.bank_acct_no
     *
     * @return the value of pay_withdraw_record.bank_acct_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getBankAcctNo() {
        return bankAcctNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.bank_acct_no
     *
     * @param bankAcctNo the value for pay_withdraw_record.bank_acct_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setBankAcctNo(String bankAcctNo) {
        this.bankAcctNo = bankAcctNo == null ? null : bankAcctNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.bank_acct_name
     *
     * @return the value of pay_withdraw_record.bank_acct_name
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getBankAcctName() {
        return bankAcctName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.bank_acct_name
     *
     * @param bankAcctName the value for pay_withdraw_record.bank_acct_name
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setBankAcctName(String bankAcctName) {
        this.bankAcctName = bankAcctName == null ? null : bankAcctName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.bank_code
     *
     * @return the value of pay_withdraw_record.bank_code
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.bank_code
     *
     * @param bankCode the value for pay_withdraw_record.bank_code
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.trade_no
     *
     * @return the value of pay_withdraw_record.trade_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.trade_no
     *
     * @param tradeNo the value for pay_withdraw_record.trade_no
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.trade_status
     *
     * @return the value of pay_withdraw_record.trade_status
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.trade_status
     *
     * @param tradeStatus the value for pay_withdraw_record.trade_status
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.clear_flag
     *
     * @return the value of pay_withdraw_record.clear_flag
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public Integer getClearFlag() {
        return clearFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.clear_flag
     *
     * @param clearFlag the value for pay_withdraw_record.clear_flag
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setClearFlag(Integer clearFlag) {
        this.clearFlag = clearFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.create_id
     *
     * @return the value of pay_withdraw_record.create_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.create_id
     *
     * @param createId the value for pay_withdraw_record.create_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.operator
     *
     * @return the value of pay_withdraw_record.operator
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.operator
     *
     * @param operator the value for pay_withdraw_record.operator
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.create_time
     *
     * @return the value of pay_withdraw_record.create_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.create_time
     *
     * @param createTime the value for pay_withdraw_record.create_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.modify_id
     *
     * @return the value of pay_withdraw_record.modify_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public Long getModifyId() {
        return modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.modify_id
     *
     * @param modifyId the value for pay_withdraw_record.modify_id
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.modifier
     *
     * @return the value of pay_withdraw_record.modifier
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.modifier
     *
     * @param modifier the value for pay_withdraw_record.modifier
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.modify_time
     *
     * @return the value of pay_withdraw_record.modify_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.modify_time
     *
     * @param modifyTime the value for pay_withdraw_record.modify_time
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.modify_ip
     *
     * @return the value of pay_withdraw_record.modify_ip
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public String getModifyIp() {
        return modifyIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.modify_ip
     *
     * @param modifyIp the value for pay_withdraw_record.modify_ip
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setModifyIp(String modifyIp) {
        this.modifyIp = modifyIp == null ? null : modifyIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay_withdraw_record.deleted
     *
     * @return the value of pay_withdraw_record.deleted
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay_withdraw_record.deleted
     *
     * @param deleted the value for pay_withdraw_record.deleted
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}