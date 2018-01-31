package com.w77996.springboot.object;

import com.w77996.springboot.bean.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(User user){
        System.out.println("send object : " + user.toString());
        this.amqpTemplate.convertAndSend("object",user);
    }
}
