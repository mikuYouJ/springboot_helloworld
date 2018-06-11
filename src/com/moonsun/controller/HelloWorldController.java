package com.moonsun.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 82610 on 2018/6/11.
 */
@RestController
@SpringBootApplication
public class HelloWorldController {

    @RequestMapping("/")
    String index(){
        return "Spring boot is running";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class,args);
    }
}
