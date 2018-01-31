package com.w77996.springboot.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hi, i am message all";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("topicExchange", "topic.1", context);
    }

    public void send1() {
        String context = "hi, i am message 1";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("topicExchange", "topic.message1", context);
    }

    public void send2() {
        String context = "hi, i am messages 2";
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("topicExchange", "topic.message2", context);
    }
}
