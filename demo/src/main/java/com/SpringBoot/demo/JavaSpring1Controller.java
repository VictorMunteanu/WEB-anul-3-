package com.SpringBoot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class JavaSpring1Controller {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello, dear programmer";
    }
}
