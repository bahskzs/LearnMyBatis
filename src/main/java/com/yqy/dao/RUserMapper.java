package com.yqy.dao;

import com.yqy.entity.RUser;
import com.yqy.entity.RUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    long countByExample(RUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    int deleteByExample(RUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    int deleteByPrimaryKey(Long idUser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    int insert(RUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    int insertSelective(RUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    List<RUser> selectByExample(RUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    RUser selectByPrimaryKey(Long idUser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    int updateByExampleSelective(@Param("record") RUser record, @Param("example") RUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    int updateByExample(@Param("record") RUser record, @Param("example") RUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    int updateByPrimaryKeySelective(RUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_user
     *
     * @mbg.generated Sat Jun 27 19:13:56 CST 2020
     */
    int updateByPrimaryKey(RUser record);
}