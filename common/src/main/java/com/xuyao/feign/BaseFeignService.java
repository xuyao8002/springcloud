package com.xuyao.feign;


import com.xuyao.model.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="server", path = "/server")
public interface BaseFeignService {

    @RequestMapping("/base/getResult/{message}")
    BaseResult getResult(@PathVariable("message") String message);


}
