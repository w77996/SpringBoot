package com.w77996.springboot.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public void send(){
        String context = "hello" + new Date();
        System.out.println("hello,sender" + context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
