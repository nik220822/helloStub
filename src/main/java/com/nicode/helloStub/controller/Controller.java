package com.nicode.helloStub.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping()
    public static String sayHello() {
        return "Hello!";
    }
}
