package net.xyt.payment.batch.mapper.withdraw;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecord;
import net.xyt.payment.batch.entity.withdraw.PayWithdrawRecordExample;
@Mapper
public interface PayWithdrawRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    long countByExample(PayWithdrawRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    int deleteByExample(PayWithdrawRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    int deleteByPrimaryKey(Long pkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    int insert(PayWithdrawRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    int insertSelective(PayWithdrawRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    List<PayWithdrawRecord> selectByExample(PayWithdrawRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    PayWithdrawRecord selectByPrimaryKey(Long pkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    int updateByExampleSelective(@Param("record") PayWithdrawRecord record, @Param("example") PayWithdrawRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    int updateByExample(@Param("record") PayWithdrawRecord record, @Param("example") PayWithdrawRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    int updateByPrimaryKeySelective(PayWithdrawRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_withdraw_record
     *
     * @mbg.generated Fri Jul 12 11:36:17 CST 2019
     */
    int updateByPrimaryKey(PayWithdrawRecord record);
}