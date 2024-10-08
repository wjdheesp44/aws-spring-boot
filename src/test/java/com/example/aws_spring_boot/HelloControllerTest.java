package com.example.aws_spring_boot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    @DisplayName("Hello world ok")
    void hello() {
        String hello = helloController.home();
        Assertions.assertEquals("hello world2", hello);
    }
}