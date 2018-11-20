package com.zhuhao.springcloud3client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class SpringCloud3clientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud3clientApplication.class, args);
    }

    @Value("${nihao}")
    String hello;

    @RequestMapping(value="/hello")
    public String hello(){
        return hello;
    }

}
