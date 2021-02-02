package com.jarosinski.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sender {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping
    public void send (@RequestParam String message) {
        System.out.println("Run send method");
        kafkaTemplate.send("DDDDDD", message);
    }
}
