package com.example.someapp.config;

import com.example.someapp.model.Book;
import com.example.someapp.model.GuessedBook;
import com.example.someapp.model.Printable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookStoreConfig {

    @Bean
    public Printable printBook() {
        return new GuessedBook();
    }

    @Bean
    public Book book() {
        return new Book();
    }

}
