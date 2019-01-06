package com.xuyao.service.impl;

import com.xuyao.dao.ServiceLogMapper;
import com.xuyao.model.ServiceLog;
import com.xuyao.service.ServiceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceLogServiceImpl implements ServiceLogService {

    @Autowired
    private ServiceLogMapper serviceLogMapper;

    @Override
    @Transactional
    public int deleteByPrimaryKey(Integer id) {
        return serviceLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(ServiceLog record) {
        return serviceLogMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(ServiceLog record) {
        return serviceLogMapper.insertSelective(record);
    }

    @Override
    public ServiceLog selectByPrimaryKey(Integer id) {
        return serviceLogMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int updateByPrimaryKeySelective(ServiceLog record) {
        return serviceLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(ServiceLog record) {
        return serviceLogMapper.updateByPrimaryKey(record);
    }
}
