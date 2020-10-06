package com.example.contract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class HelloBase {
    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new HelloController(new HelloService()));
    }
}
