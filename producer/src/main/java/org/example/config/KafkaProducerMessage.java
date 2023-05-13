package org.example.config;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.Message;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import static org.example.config.KafkaProducerMessageConfig.*;

@Slf4j
@Component
@AllArgsConstructor
public class KafkaProducerMessage {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void send(Message message) {
        kafkaTemplate.send(TOPIC_NAME, message.senderName(), message);
        log.info("Message sent: {}", message);
    }
}
