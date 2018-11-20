package com.zhuhao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableConfigServer
@SpringBootApplication
public class SpringCloud2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud2Application.class, args);
    }
}
