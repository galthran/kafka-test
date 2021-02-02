package com.jarosinski.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Reader {

    @KafkaListener(topics = "DDDDDD")
    public void read(String message) {
        System.out.println(message);
    }
}
