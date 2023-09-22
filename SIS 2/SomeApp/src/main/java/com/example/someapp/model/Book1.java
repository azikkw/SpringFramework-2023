package com.example.someapp.model;

public class Book1 implements PrintBook {

    @Override
    public String print(String book) {
        return String.format("Congratulations!!! You guessed the book, it's called - %s", book);
    }
}
