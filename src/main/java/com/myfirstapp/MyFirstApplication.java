package com.myfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstApplication {

    public static void main(String[] args) {
        System.out.println("Hello from Murali!!!");
        SpringApplication.run(MyFirstApplication.class, args);
    }
}
