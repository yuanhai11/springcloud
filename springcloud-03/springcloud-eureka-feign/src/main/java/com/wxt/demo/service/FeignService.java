package com.wxt.demo.service;

import com.wxt.demo.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloud-eureka-client", fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping(value = "/api/queryUserInfo", method = RequestMethod.GET)
    String queryUserInfo(@RequestParam String userId);

}
