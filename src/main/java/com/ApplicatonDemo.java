package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/4/14
 */
@SpringBootApplication
@EnableScheduling
public class ApplicatonDemo {

    public static void main(String[] args) {
        System.out.println(" Spring Application run!");
        SpringApplication.run(ApplicatonDemo.class,args);
    }
}
