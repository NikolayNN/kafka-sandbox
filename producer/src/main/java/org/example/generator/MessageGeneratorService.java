package org.example.generator;

import org.example.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageGeneratorService {
    public Message generate() {
        return new Message(
                TitleGenerator.generate(),
                BodyGenerator.generate(),
                SenderNameGenerator.generate()
        );
    }
}
