package com.lizhp.springcloud.bus;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: KafKaListener
 * @PackageName: com.lizhp.springcloud.bus
 * @Description: kafka消息监听
 * @Author lizhp
 * @Create 2018-08-29 11:17
 **/
@Component
public class KafKaListener {

//    @KafkaListener(topics = {"topic.test"})
//    public void listen(ConsumerRecord<String, String> record, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
//        Optional<String> kafkaMessage = Optional.ofNullable(record.value());
//        if (kafkaMessage.isPresent()) {
//            Object message = kafkaMessage.get();
//            System.out.println("------------------ message =topic：" + topic + ", " + message.toString());
//        }
//    }

    @KafkaListener(topics = {"topic.test"})
    public void listen(String data) {

        System.out.println("------------------ message =topic：" + data );
    }

    @Transactional(propagation = Propagation.REQUIRED)

}
