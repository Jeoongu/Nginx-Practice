package com.aledma.nginxpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello(){
        return "Nginx blue / green 무중단 배포 프로젝트";
    }
}
