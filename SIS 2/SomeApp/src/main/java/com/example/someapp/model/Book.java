package com.example.someapp.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {

    @Autowired
    private Printable printable;

    public void setBook(Printable printable) {
        this.printable = printable;
    }

    public String printBook(String book) {
        return printable.print(book);
    }

}
