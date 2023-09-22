package com.example.someapp.config;

import com.example.someapp.model.Book;
import com.example.someapp.model.Book1;
import com.example.someapp.model.PrintBook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookStoreConfig {

    @Bean
    public PrintBook printBook() {
        return new Book1();
    }

    @Bean
    public Book book() {
        return new Book();
    }

}
