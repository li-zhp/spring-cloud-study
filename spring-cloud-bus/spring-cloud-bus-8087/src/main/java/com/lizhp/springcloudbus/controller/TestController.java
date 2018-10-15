package com.lizhp.springcloudbus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @PackageName: com.lizhp.springcloudbus.controller
 * @Description: 测试接口，用来发送消息
 * @Author lizhp
 * @Create 2018-08-27 18:27
 **/
@RestController
public class TestController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping(value = "/api/service/sender/{message}")
    public String sendMessage(@PathVariable(value = "message") String message){
        kafkaTemplate.send("topic.test", message);
        return message;
    }
}
