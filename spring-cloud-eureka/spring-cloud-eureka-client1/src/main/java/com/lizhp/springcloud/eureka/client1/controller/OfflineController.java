package com.lizhp.springcloud.eureka.client1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: OfflineController
 * @PackageName: com.lizhp.springcloud.eureka.client1.controller
 * @Description: 下线接口
 * @Author lizhp
 * @Create 2018-08-16 20:34
 **/
@Component
public class OfflineController {

    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/api/service/offline")
    public void offlineEurekaClient(){
//        DiscoveryClient.
//        discoveryClient.shutdown();
    }
}
