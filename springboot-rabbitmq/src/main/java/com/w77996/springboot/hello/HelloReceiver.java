package com.w77996.springboot.hello;

import com.w77996.springboot.bean.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(User hello){
        System.out.println("Receiver : "+hello.toString());
    }
}
