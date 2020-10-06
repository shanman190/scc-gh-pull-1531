package com.example.contract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public Response sayHello(@RequestParam(required = false) String name) {
        return new Response(helloService.sayHello(name));
    }
}

class Response {
    private final String message;

    Response(String message) {
        this.message = message;
    }

    public String getMessage() { return message; }
}