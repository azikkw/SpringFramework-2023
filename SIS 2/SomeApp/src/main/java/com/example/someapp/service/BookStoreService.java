package com.example.someapp.service;

import com.example.someapp.model.Book;
import com.example.someapp.model.Book1;
import com.example.someapp.model.Book2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreService {

    @Autowired
    private Book book;

    public BookStoreService() {

    }

    public String printBook(String name) {
        if(name.contains("Leviathan")) {
            book.setBook(new Book1());
        } else book.setBook(new Book2());

        return book.printBook(name);
    }

}
