package com.lizhp.springcloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @PackageName: com.lizhp.springcloud.eureka.client.controller
 * @Description: 下线接口
 * @Author lizhp
 * @Create 2018-08-16 20:34
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/api/service/info")
    public String getInfo() {
        return "This server is Eureka Client, this port is " + port;
    }
}
