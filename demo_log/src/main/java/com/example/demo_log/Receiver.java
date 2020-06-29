package com.example.demo_log;

import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @author wangchenxin
 * @date 2020/6/29  15:57
 * @desc
 */

@Component
public class Receiver {
    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public void printMessage(String message){
        System.out.println("receiver：" + message);
    }
}
