package com.example.someapp.model;

public class GuessedBook implements Printable {

    @Override
    public String print(String book) {
        return String.format("Congratulations!!! You guessed the book, it's called - %s", book);
    }
}
