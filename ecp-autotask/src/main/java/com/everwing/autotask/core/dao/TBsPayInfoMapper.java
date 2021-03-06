package com.everwing.autotask.core.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.everwing.coreservice.common.wy.entity.account.pay.TBsPayInfoDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import com.everwing.coreservice.common.wy.entity.account.pay.TBsPayInfo;
import com.everwing.coreservice.common.wy.entity.account.pay.TBsPayInfoExample;
import org.springframework.stereotype.Repository;

@Repository
public interface TBsPayInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    long countByExample(TBsPayInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    int deleteByExample(TBsPayInfoExample example) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    int deleteByPrimaryKey(String id) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    int insert(TBsPayInfo record) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    int insertSelective(TBsPayInfo record) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    List<TBsPayInfo> selectByExample(TBsPayInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    TBsPayInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    int updateByPrimaryKeySelective(TBsPayInfo record) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pay_info
     *
     * @mbg.generated Tue Oct 24 16:25:32 CST 2017
     */
    int updateByPrimaryKey(TBsPayInfo record) throws DataAccessException;

	List<TBsPayInfo> listPage(TBsPayInfo info);

	TBsPayInfo findSumByObjCurrent(TBsPayInfo info);
	
	List<String> findBuildingNames(TBsPayInfo info);

	int batchInsert(List<TBsPayInfo> insertInfos) throws DataAccessException;

	List<TBsPayInfo> listPage4Building(TBsPayInfo info);

	List<TBsPayInfo> listPageHistory(TBsPayInfo info);

	TBsPayInfo findSumByObjCurrent4Building(TBsPayInfo info);
	
	List<String> findBuildingNames4Building(TBsPayInfo info);
	
	//为财务推送业主交费，购买产品等数据信息用
	List<TBsPayInfo> getPushDataFroFinece(Map<String, String> paramMap);

	Map<String,Double> getSumDataFroFinece(Map<String, String> paramMap);

	Map<String,Double> getSumCollectFroFinece(Map<String, String> paramMap);

	
	//为财务推送托收数据信息(和周期性收费有区别)
	List<TBsPayInfo> getPushCollectDataToFinece(Map<String, String> paramMap);
	

	List<TBsPayInfo> listPageHistory4Building(TBsPayInfo info);

	List<TBsPayInfo> listPageHistory4Cust(TBsPayInfo info);

	Double findLateFee(@Param("buildingCode") String buildingCode, @Param("type") Integer type);

	List<TBsPayInfo> findDatas(TBsPayInfo info);

	//获取所有计费数据
	List<TBsPayInfo> findBillingsDataByObj(TBsPayInfo info);  
	
	//获取所有账户流水数据
	List<TBsPayInfo> findAccountDatasByObj(TBsPayInfo info);

	List<TBsPayInfo> findExportPayInfoDatasByObj(TBsPayInfo info);

	TBsPayInfo findTotalDatasByObj(TBsPayInfo info);

	//添加上退款这种情况的查询
	TBsPayInfo findTotalDatasForRefund(TBsPayInfo info);

	TBsPayInfo findSumByObjCurrent4BuildingNew(TBsPayInfo info);
	TBsPayInfo findToBatchNo(String batchNo);

	List<TBsPayInfo> findToTimeAndBuildingCode(@Param("createTime") Date createTime, @Param("buildingCode") String buildingCode);

	/**
	 * 根据buildingCode 得到支付和减免退款金额
	 * @param buildingCode
	 * @return
	 */
	Map<String,Object> findToBuilidngCodePayMoneyAndBackAndJm(String buildingCode);

	List<TBsPayInfoDto> finfListTBsPayInfo(String projectId);

	Double findWXAppletsMoney(TBsPayInfo info);
}