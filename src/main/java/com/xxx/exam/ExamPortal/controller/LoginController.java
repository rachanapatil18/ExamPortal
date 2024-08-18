package com.xxx.exam.ExamPortal.controller;

import com.xxx.exam.ExamPortal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examportal")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello");
        int x = loginService.m1();

        return "hello world" +x;
    }
}
