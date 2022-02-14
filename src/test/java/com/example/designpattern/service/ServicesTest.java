package com.example.designpattern.service;

import com.example.designpattern.dto.UserRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServicesTest {

    @Autowired
    private Services Services;

    @Test
    void doOperation() {

        UserRequest userRequest1 = new UserRequest("multiply", 23, 67);
        UserRequest userRequest2 = new UserRequest("add", 3453, 345353);

    }
}