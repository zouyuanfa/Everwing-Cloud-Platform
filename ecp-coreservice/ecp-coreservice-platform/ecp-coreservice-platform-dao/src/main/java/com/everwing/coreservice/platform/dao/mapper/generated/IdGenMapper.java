package com.everwing.coreservice.platform.dao.mapper.generated;

import com.everwing.coreservice.common.platform.entity.generated.IdGen;
import com.everwing.coreservice.common.platform.entity.generated.IdGenExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IdGenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    long countByExample(IdGenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    int deleteByExample(IdGenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    int insert(IdGen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    int insertSelective(IdGen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    List<IdGen> selectByExample(IdGenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    IdGen selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") IdGen record, @Param("example") IdGenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") IdGen record, @Param("example") IdGenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(IdGen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table id_gen
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(IdGen record);
}