package com.example.demo.service;

import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class MyTestService {
    public void demo() {
        System.out.println("myTestService");
    }
}
