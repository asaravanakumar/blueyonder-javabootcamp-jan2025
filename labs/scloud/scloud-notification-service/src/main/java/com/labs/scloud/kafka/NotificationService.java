package com.labs.scloud.kafka;

import com.labs.scloud.discovery.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {

//    @KafkaListener(topics = {"product-events"}, groupId = "notification-group")
//    public void handleProductEvents(String event) {
//        log.info("Received product events: " + event);
//    }



    @KafkaListener(topics = {"product-events"}, groupId = "notification-group1", containerFactory = "productKafkaListenerContainerFactory")
    public void handleProductEvents(Product event) {
        log.info("Received product events: " + event);
    }
}
