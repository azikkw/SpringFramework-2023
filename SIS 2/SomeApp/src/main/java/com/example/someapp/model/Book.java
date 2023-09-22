package com.example.someapp.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {

    @Autowired
    private PrintBook printBook;

    public void setBook(PrintBook printBook) {
        this.printBook = printBook;
    }

    public String printBook(String book) {
        return printBook.print(book);
    }

}
