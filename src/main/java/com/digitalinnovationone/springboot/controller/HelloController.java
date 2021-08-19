package com.digitalinnovationone.springboot.controller;

@RestController
public class HelloController {

    public String helloMessage(String s) {
        return helloMessage("Hello, Digital Innovation One!");
    }
}
