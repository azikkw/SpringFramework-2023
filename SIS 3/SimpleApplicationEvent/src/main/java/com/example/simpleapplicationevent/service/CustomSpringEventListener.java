package com.example.simpleapplicationevent.service;

import com.example.simpleapplicationevent.model.CustomSpringEvent;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

//@Slf4j
//@Service
//public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent> {
//
//    public void onApplicationEvent(CustomSpringEvent event) {
////        log.info("Received spring custom event - " + event.getMessage());
//        System.out.println("Received spring custom event - " + event.getMessage());
//    }
//
//}

@Service
public class CustomSpringEventListener {

    @EventListener
    public void onApplicationEvent(CustomSpringEvent event) throws InterruptedException {
//        log.info("Received spring custom event - " + event.getMessage());
        System.out.println("Received spring custom event - " + event.getMessage());
    }

}