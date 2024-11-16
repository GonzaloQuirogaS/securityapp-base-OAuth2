package com.oauth.client.securityappbaseoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @GetMapping("/helloSecured")
    public String helloSecured(){
        return "Hello world secured";
    }
}
