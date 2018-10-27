package com.xuyao.controller;

import com.xuyao.feign.BaseFeignService;
import com.xuyao.model.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private BaseFeignService baseFeignService;

    @RequestMapping("/result/{message}")
    public BaseResult getResult(@PathVariable String message){
        BaseResult xuyao = baseFeignService.getResult(message);
        return xuyao;
    }


}
