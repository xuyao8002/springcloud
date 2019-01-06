package com.xuyao.feign;


import com.xuyao.model.BaseResult;
import com.xuyao.model.ServiceLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="server1", path = "/server1")
public interface ServiceLogFeignService {

    @RequestMapping("/serviceLog/add")
    BaseResult add(@RequestBody ServiceLog serviceLog);


}
