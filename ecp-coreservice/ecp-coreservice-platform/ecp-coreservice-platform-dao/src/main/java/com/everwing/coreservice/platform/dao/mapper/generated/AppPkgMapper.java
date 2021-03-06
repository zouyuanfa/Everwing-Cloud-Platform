package com.everwing.coreservice.platform.dao.mapper.generated;

import com.everwing.coreservice.common.platform.entity.generated.AppPkg;
import com.everwing.coreservice.common.platform.entity.generated.AppPkgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppPkgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    long countByExample(AppPkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int deleteByExample(AppPkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String appPkgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int insert(AppPkg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int insertSelective(AppPkg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    List<AppPkg> selectByExampleWithBLOBs(AppPkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    List<AppPkg> selectByExample(AppPkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    AppPkg selectByPrimaryKey(String appPkgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AppPkg record, @Param("example") AppPkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") AppPkg record, @Param("example") AppPkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AppPkg record, @Param("example") AppPkgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AppPkg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(AppPkg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_pkg
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AppPkg record);
}