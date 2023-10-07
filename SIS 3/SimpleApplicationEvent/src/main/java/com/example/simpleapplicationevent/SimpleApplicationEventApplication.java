package com.example.simpleapplicationevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class SimpleApplicationEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplicationEventApplication.class, args);
    }

}
