package com.example.contract;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestHelloService {
    private HelloService helloService;

    @BeforeEach
    void setup() {
        helloService = new HelloService();
    }

    @Test
    void defaultSayHello() {
        assertThat(helloService.sayHello(null)).isEqualTo("Hello, world!");
    }

    @Test
    void namedSayHello() {
        assertThat(helloService.sayHello("John")).isEqualTo("Hello, John!");
    }
}
