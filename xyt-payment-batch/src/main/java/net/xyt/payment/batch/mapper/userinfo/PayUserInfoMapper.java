package net.xyt.payment.batch.mapper.userinfo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.xyt.payment.batch.entity.userinfo.PayUserInfo;
import net.xyt.payment.batch.entity.userinfo.PayUserInfoExample;
@Mapper
public interface PayUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    long countByExample(PayUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    int deleteByExample(PayUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    int deleteByPrimaryKey(Long pkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    int insert(PayUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    int insertSelective(PayUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    List<PayUserInfo> selectByExample(PayUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    PayUserInfo selectByPrimaryKey(Long pkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") PayUserInfo record, @Param("example") PayUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    int updateByExample(@Param("record") PayUserInfo record, @Param("example") PayUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    int updateByPrimaryKeySelective(PayUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pay_user_info
     *
     * @mbg.generated Thu Jun 20 16:36:41 CST 2019
     */
    int updateByPrimaryKey(PayUserInfo record);
}