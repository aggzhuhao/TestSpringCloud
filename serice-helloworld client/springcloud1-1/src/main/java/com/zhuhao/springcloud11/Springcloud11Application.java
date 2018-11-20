package com.zhuhao.springcloud11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class Springcloud11Application {
    @Value("${server.port}")
    String port;

    public static void main(String[] args) {
        SpringApplication.run(Springcloud11Application.class, args);
    }

    @RequestMapping("/")
    public String home(){
        return "hello spring cloud from port 号 " + port;
    }

}
