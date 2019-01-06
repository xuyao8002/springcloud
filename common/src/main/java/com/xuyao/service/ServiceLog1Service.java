package com.xuyao.service;


import com.xuyao.model.BaseResult;
import com.xuyao.model.ServiceLog;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface ServiceLog1Service {

    @RequestMapping("/serviceLog/add")
    BaseResult add(@RequestBody ServiceLog serviceLog);


}
