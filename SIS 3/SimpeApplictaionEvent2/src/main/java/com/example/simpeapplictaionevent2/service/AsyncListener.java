package com.example.simpeapplictaionevent2.service;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncListener {

    @Async
    @EventListener
    void handleAsyncEvent(String event) {
        System.out.println("Async event received - " + event);
    }

}
