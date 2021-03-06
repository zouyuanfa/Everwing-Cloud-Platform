package com.everwing.coreservice.common.wy.service.business.meterdata;/**
 * Created by wust on 2017/7/24.
 */

import com.everwing.coreservice.common.context.WyBusinessContext;
import com.everwing.coreservice.common.MessageMap;
import com.everwing.coreservice.common.wy.entity.business.meterdata.TcMeterData;

import java.util.List;

/**
 *
 * Function:
 * Reason:
 * Date:2017/7/24
 * @author wusongti@lii.com.cn
 */
public interface TcWaterMeterReadingImportService {
    MessageMap importWaterMeterReading(WyBusinessContext ctx, String batchNo, String excelPath, String taskId);
    MessageMap importWaterMeterReading(WyBusinessContext ctx, List<TcMeterData> meterDataList, String taskId);
}
