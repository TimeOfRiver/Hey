package com.rabbitmq;

import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/5/13
 */
@Service
public class Receiver {
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

}
