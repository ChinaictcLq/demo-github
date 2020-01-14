package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;

@RestController
public class HelloController {

    @RequestMapping("info")
    public String info(){
        return "Hello SpringBoot Info!";
    }
}
