package com.lizhp.springcloud.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @InterfaceName: SchedualEurekaClient
 * @PackageName: com.lizhp.springcloud.feign.clients
 * @Description: 调度Eureka Client客户端
 * @Author lizhp
 * @Create 2018-08-18 17:05
 **/
@FeignClient(value = "eureka-client")
public interface SchedualEurekaClient {

    @RequestMapping(value="/api/service/info", method = RequestMethod.GET)
    String invokeEurekaClientInfo();

}
