package com.wxt.demo.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
public class EurekaClientController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public String queryUserInfo(@RequestParam String userId) {
        return "Hi 微信公众号：bugstack虫洞栈 | " + userId + " >: from eureka client port: " + port;
    }

}

