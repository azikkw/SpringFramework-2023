package com.example.simpleapplicationevent.controller;

import com.example.simpleapplicationevent.service.CustomSpringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomSpringController {

    private final CustomSpringService customSpringService;

    @GetMapping("/print")
    public String print(@RequestParam String message) {
        return customSpringService.print(message);
    }

}
