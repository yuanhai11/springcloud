package com.wxt.demo.controller;

import com.wxt.demo.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {
    @Resource
    FeignService feignService;

    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public String queryUserInfo(@RequestParam String userId) {
        return feignService.queryUserInfo(userId) + " From Feign";
    }
}
