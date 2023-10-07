package com.example.someapp.service;

import com.example.someapp.model.Book;
import com.example.someapp.model.GuessedBook;
import com.example.someapp.model.OtherBook;
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
            book.setBook(new GuessedBook());
        } else book.setBook(new OtherBook());

        return book.printBook(name);
    }

}
