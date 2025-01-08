package com.techsuni.tracking.feed.reader.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @JmsListener(destination ="DEV.QUEUE.1", concurrency = "1-2", containerFactory = "JMSconnectionFactory")
    public void receiveMessage(String message) {
        System.out.println("Received message:" + message);
    }

}
