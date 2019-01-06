package com.xuyao.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.xuyao.dao.ServiceLog1Mapper;
import com.xuyao.model.BaseResult;
import com.xuyao.model.ServiceLog;
import com.xuyao.service.ServiceLog1Service;
import com.xuyao.service.ServiceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceLogServiceImpl implements ServiceLogService, ServiceLog1Service {

    @Autowired
    private ServiceLog1Mapper serviceLog1Mapper;

    @Override
    @Transactional
    public int deleteByPrimaryKey(Integer id) {
        return serviceLog1Mapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(ServiceLog record) {
        return serviceLog1Mapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(ServiceLog record) {
        return serviceLog1Mapper.insertSelective(record);
    }

    @Override
    public ServiceLog selectByPrimaryKey(Integer id) {
        return serviceLog1Mapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int updateByPrimaryKeySelective(ServiceLog record) {
        return serviceLog1Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(ServiceLog record) {
        return serviceLog1Mapper.updateByPrimaryKey(record);
    }

    @Override
    @TxTransaction
    @Transactional
    public BaseResult add(@RequestBody ServiceLog serviceLog) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode("200");
        baseResult.setMessage("ok");
        int i = insertSelective(serviceLog);
        baseResult.setData(i);
        return baseResult;
    }
}
