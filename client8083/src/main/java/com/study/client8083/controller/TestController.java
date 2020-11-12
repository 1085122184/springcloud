package com.study.client8083.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuijixu
 */
@RestController
public class TestController {
    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/getName")
    public String get() {
        return "my name is "+name;
    }
}
