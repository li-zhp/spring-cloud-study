package com.lizhp.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: RibbonConfiguration
 * @PackageName: com.lizhp.springcloud.ribbon.config
 * @Description: ribbon配置
 * @Author lizhp
 * @Create 2018-08-17 13:52
 **/
public class RibbonConfiguration {

    @Bean
    public IRule getCustomRule(){
        return new RandomRule();
    }

}
