package com.rabbitmq;

import com.ApplicatonDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/5/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicatonDemo.class)
public class RabbitMqHelloTest {
    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception{
        sender.send();
    }

}
