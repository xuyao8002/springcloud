package com.xuyao.service.impl;


import com.xuyao.model.BaseResult;
import com.xuyao.service.BaseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BaseServiceImpl implements BaseService{

    @Override
    public BaseResult getResult(@PathVariable("message") String message){
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        BaseResult<Map> result = new BaseResult<>();
        result.setCode("200");
        result.setMessage("ok");
        result.setData(map);
        return result;
    }

}
