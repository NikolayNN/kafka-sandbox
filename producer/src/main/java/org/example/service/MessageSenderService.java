package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.config.KafkaProducerMessage;
import org.example.generator.MessageGeneratorService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageSenderService {
    private final KafkaProducerMessage producer;
    private final MessageGeneratorService generatorService;

    @Scheduled(fixedDelay = 5000)
    public void run() {
        var message = generatorService.generate();
        producer.send(message);
    }
}
