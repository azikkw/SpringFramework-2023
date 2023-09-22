package com.example.someapp.controller;

import com.example.someapp.service.BookStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookStoreController {

    private final BookStoreService bookStoreService;

    @GetMapping("/print-book")
    public String printBook(@RequestParam String book) {
        return bookStoreService.printBook(book);
    }

}
