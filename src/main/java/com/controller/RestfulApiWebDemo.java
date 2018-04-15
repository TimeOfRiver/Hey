package com.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author luoyalan
 * @date 2018/4/14
 */
@RestController
@EnableAutoConfiguration
public class RestfulApiWebDemo {

    @RequestMapping("/")
    public String home() {
        return "Hello,spring boot!";
    }
}
