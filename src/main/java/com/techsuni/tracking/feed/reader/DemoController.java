package com.techsuni.tracking.feed.reader;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

   private final JmsTemplate jmsTemplate;

    public DemoController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestBody String data) {
        jmsTemplate.convertAndSend("DEV.QUEUE.1",data);
    }
}

