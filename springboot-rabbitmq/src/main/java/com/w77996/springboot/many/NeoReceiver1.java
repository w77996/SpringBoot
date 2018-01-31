package com.w77996.springboot.many;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "neo")
public class NeoReceiver1 {

    public void process(String neo){
        System.out.println("Receiver1 :"+neo);
    }
}
