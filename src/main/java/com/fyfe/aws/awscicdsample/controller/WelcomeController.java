package com.fyfe.aws.awscicdsample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/")
    public String welcome(){
        return "I'm on AWS! :D";
    }
}
