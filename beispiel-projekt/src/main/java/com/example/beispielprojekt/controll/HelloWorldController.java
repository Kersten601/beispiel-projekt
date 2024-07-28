package com.example.beispielprojekt.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hallo")
    public String helloWorld() {
        return  "hello Katarina";
    }
}
