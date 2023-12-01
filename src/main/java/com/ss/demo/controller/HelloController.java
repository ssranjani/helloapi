package com.ss.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/demo")
    public ResponseEntity<String> display(){
        return ResponseEntity.ok("Hello there!");
    }
}
