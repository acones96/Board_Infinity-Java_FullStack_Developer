package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET HTTP Method
        // localhost:8080/
        @GetMapping("/") // Default
        public String message() {
            return "Welcome to String Boot Application";
        }

        // localhost:8080/hello
        @GetMapping("/hello")
        public String helloWorld() {
            return "Hello World";
        }
}
