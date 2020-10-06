package com.example.contract;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloService {
    public String sayHello(String name) {
        return String.format("Hello, %s!", StringUtils.hasText(name) ? name : "world");
    }
}
