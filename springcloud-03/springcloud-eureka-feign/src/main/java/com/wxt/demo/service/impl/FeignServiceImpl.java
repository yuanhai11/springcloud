package com.wxt.demo.service.impl;

import com.wxt.demo.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String queryUserInfo(String userId) {
        return "queryUserInfo by userId：" + userId + " err！from feign hystrix";
    }
}
