package com.ivo.springboot.demo.springbootfirstproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
}
