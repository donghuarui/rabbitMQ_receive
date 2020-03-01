package com.dhr.controller;

import com.dhr.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceive {

    @RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void processC(User user) {
        System.out.println("Receive:"+user);
    }

}