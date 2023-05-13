package org.example.config;


import lombok.extern.slf4j.Slf4j;
import org.example.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumerMessage {
    @KafkaListener(topics = KafkaConsumerMessageConfig.TOPIC_NAME, groupId = "group1")
    public void consumeGroup1(Message message) {
        log.info("Consumed by group1: {}", message);
    }

    @KafkaListener(topics = KafkaConsumerMessageConfig.TOPIC_NAME, groupId = "group2")
    public void consumeGroup2(Message message) {
        log.info("Consumed by group2: {}", message);
    }
}
