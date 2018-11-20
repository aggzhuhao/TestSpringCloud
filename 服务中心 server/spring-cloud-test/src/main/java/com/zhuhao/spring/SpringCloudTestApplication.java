package com.zhuhao.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudTestApplication {
    @Value("${eureka.instance.hostname}")
    String hostname;

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudTestApplication.class, args);
    }
    @ResponseBody
    @RequestMapping("/hostname")
    public String hostname(){
        return hostname;
    }
}
