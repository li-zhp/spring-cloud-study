package com.lizhp.springcloud.feign.controller;

import com.lizhp.springcloud.feign.clients.SchedualEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: FeignController
 * @PackageName: com.lizhp.springcloud.feign.controller
 * @Description: Feign测试接口类
 * @Author lizhp
 * @Create 2018-08-18 17:03
 **/
@RestController
public class FeignController {

    @Autowired
    private SchedualEurekaClient schedualEurekaClient;

    @GetMapping(value = "/eureka-client-info")
    public String getEurekaClientInfo(){
        return schedualEurekaClient.invokeEurekaClientInfo();
    }
}
