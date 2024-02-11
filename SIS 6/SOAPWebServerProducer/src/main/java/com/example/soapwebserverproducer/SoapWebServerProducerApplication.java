package com.example.soapwebserverproducer;

import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapWebServerProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapWebServerProducerApplication.class, args);
    }

}
