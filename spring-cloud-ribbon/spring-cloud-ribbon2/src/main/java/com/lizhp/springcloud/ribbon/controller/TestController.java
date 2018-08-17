package com.lizhp.springcloud.ribbon.controller;

import com.lizhp.springcloud.config.RibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: TestController
 * @PackageName: com.lizhp.springcloud.ribbon.controller
 * @Description: 测试相关接口类
 * @Author lizhp
 * @Create 2018-08-17 11:26
 **/
@RestController
@RibbonClient(name = "eureka-client", configuration = RibbonConfiguration.class)
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/api/service/eureka-client-info")
    public String getEurekaClientInfo(){
        return restTemplate.getForObject("http://eureka-client/api/service/info", String.class);
    }
}
