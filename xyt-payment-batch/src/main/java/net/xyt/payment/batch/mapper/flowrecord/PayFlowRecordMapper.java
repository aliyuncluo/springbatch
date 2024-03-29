package net.xyt.payment.batch.mapper.flowrecord;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.xyt.payment.batch.entity.flowrecord.PayFlowRecord;
import net.xyt.payment.batch.entity.flowrecord.PayFlowRecordExample;
@Mapper
public interface PayFlowRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    long countByExample(PayFlowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    int deleteByExample(PayFlowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    int deleteByPrimaryKey(Long pkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    int insert(PayFlowRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    int insertSelective(PayFlowRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    List<PayFlowRecord> selectByExample(PayFlowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    PayFlowRecord selectByPrimaryKey(Long pkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") PayFlowRecord record, @Param("example") PayFlowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    int updateByExample(@Param("record") PayFlowRecord record, @Param("example") PayFlowRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    int updateByPrimaryKeySelective(PayFlowRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_flow_record
     *
     * @mbg.generated Wed Jun 26 10:02:19 CST 2019
     */
    int updateByPrimaryKey(PayFlowRecord record);
}