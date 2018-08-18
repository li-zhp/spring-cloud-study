package com.lizhp.springcloud.eureka.server.listener;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: EurekaClientStateChangeListener
 * @PackageName: com.lizhp.springcloud.eureka.server.listener
 * @Description: Eureka Client状态变化监听器
 * @Author lizhp
 * @Create 2018-08-16 18:06
 **/
@Slf4j
@Component
public class EurekaClientStateChangeListener {

//    EurekaInstanceCanceledEvent 服务下线事件
//    EurekaInstanceRegisteredEvent 服务注册事件
//    EurekaInstanceRenewedEvent 服务续约事件
//    EurekaRegistryAvailableEvent Eureka注册中心启动事件
//    EurekaServerStartedEvent Eureka Server启动事件

    /**
     * 服务下线事件
     * @see https://blog.csdn.net/qq924862077/article/details/80141686 服务下线
     * @param event
     */
    @EventListener
    public void listenCanceled(EurekaInstanceCanceledEvent event) {
        log.info("服务下线：{}", event);
    }

    /**
     * 服务注册事件
     *
     * @param event
     */
    @EventListener
    public void listenRegisterd(EurekaInstanceRegisteredEvent event) {
        log.info("服务注册：{}", event);
    }

    /**
     * 服务续约
     *
     * @param event
     */
    @EventListener
    public void listenRenwed(EurekaInstanceRenewedEvent event) {
        log.info("服务续约：{}", event);
    }

    @EventListener
    public void listenRegistryAvailable(EurekaRegistryAvailableEvent event) {
        log.info("Eureka注册中心启动：{}", event);
    }

    @EventListener
    public void listenServerStarted(EurekaServerStartedEvent event) {
        log.info("Eureka Server注册中心启动：{}", event);
    }

}
