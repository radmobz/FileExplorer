package com.julien.alexis.dev;

import javax.xml.ws.RequestWrapper;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
    @RequestMapping("/bite")
    String bite() {
        return "Coucou tu veux voir ma bite ?";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}