package com.xuyao.dao;


import com.xuyao.model.ServiceLog;

public interface ServiceLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceLog record);

    int insertSelective(ServiceLog record);

    ServiceLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceLog record);

    int updateByPrimaryKey(ServiceLog record);
}