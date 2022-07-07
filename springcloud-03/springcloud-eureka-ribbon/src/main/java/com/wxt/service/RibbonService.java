package com.wxt.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "queryUserInfoFallback")
    public String queryUserInfo(String userId) {
        return restTemplate.getForObject("http://SPRINGCLOUD-EUREKA-CLIENT/api/queryUserInfo?userId=" + userId, String.class);
    }

    public String queryUserInfoFallback(String userId) {
        return "queryUserInfo by userId：" + userId + " err！from ribbon hystrix";
    }

}
