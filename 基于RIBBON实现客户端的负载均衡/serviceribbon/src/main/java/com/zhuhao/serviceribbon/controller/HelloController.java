package com.zhuhao.serviceribbon.controller;

import com.zhuhao.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String hello(){
        return helloService.getHelloContext();
    }

}
