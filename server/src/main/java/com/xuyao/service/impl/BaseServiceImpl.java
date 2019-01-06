package com.xuyao.service.impl;


import com.codingapi.tx.annotation.TxTransaction;
import com.xuyao.feign.ServiceLogFeignService;
import com.xuyao.model.BaseResult;
import com.xuyao.model.ServiceLog;
import com.xuyao.service.BaseService;
import com.xuyao.service.ServiceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BaseServiceImpl implements BaseService{

    @Autowired
    private ServiceLogService serviceLogService;

    @Autowired
    private ServiceLogFeignService serviceLogFeignService;

    @Override
    @Transactional
    @TxTransaction(isStart=true)
    public BaseResult getResult(@PathVariable("message") String message){
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        BaseResult<Map> result = new BaseResult<>();
        result.setCode("200");
        result.setMessage("ok");
        result.setData(map);
        ServiceLog serviceLog = new ServiceLog();
        serviceLog.setCreatetime(new Date());
        map.put("service", serviceLogService.insertSelective(serviceLog));
        serviceLog = new ServiceLog();
        serviceLog.setCreatetime(new Date());
        map.put("service1", serviceLogFeignService.add(serviceLog));
        String str = "hello";//null; 改为null，出现异常，server、server1中事务都会回滚
        System.out.println(str.length());
        return result;
    }

}
