package com.everwing.autotask.core.jobs;/**
 * Created by wust on 2018/12/19.
 */

import com.alibaba.fastjson.JSONObject;
import com.everwing.autotask.core.service.SynchrodataService;
import com.everwing.cache.redis.SpringRedisTools;
import com.everwing.coreservice.common.enums.ApplicationConstant;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * Function:同步数据调度器
 * Reason:
 * Date:2018/12/19
 * @author wusongti@lii.com.cn
 */
@JobHandler("syncDataJobHandler")
@Component
public class SyncDataJobHandler extends IJobHandler {
    @Autowired
    private SpringRedisTools springRedisTools;

    @Autowired
    private SynchrodataService synchrodataService;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        Object dataSourceObj = springRedisTools.getByKey(ApplicationConstant.REDIS_TABLE_KEY_DATA_SOURCE.getStringValue());
        if(dataSourceObj != null){
            JSONObject jsonObject = JSONObject.parseObject(dataSourceObj.toString());
            Set<String> keys = jsonObject.keySet();
            Iterator<String> iterator = keys.iterator();
            while (iterator.hasNext()){
                final String companyId = iterator.next();
                threadPoolTaskExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        synchrodataService.syncData(companyId);
                    }
                });
            }
        }
        return ReturnT.SUCCESS;
    }
}
