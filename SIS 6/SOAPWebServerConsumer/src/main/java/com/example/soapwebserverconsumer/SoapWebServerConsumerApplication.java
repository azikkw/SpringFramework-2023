package com.example.soapwebserverconsumer;

import com.example.soapwebserverconsumer.service.CountryClient;
import com.example.soapwebserverconsumer.wsdl.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapWebServerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapWebServerConsumerApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(CountryClient quoteClient) {
        return args -> {
            String country = "Russia";

            if(args.length > 0) {
                country = args[0];
            }

            GetCountryResponse response = quoteClient.getCountry(country);
            System.err.println(response.getCountry().getCurrency());
        };
    }

}
