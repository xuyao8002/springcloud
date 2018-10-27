package com.xuyao.service;


import com.xuyao.model.BaseResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface BaseService {

    @RequestMapping("/base/getResult/{message}")
    BaseResult getResult(@PathVariable("message") String message);


}
