package com.rabbitmq;

import com.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/5/13
 */
@Service
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_NAME, context);
    }
}
