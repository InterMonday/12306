package com.mon.train.member.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello!");
        return "hello!";
    }
}
