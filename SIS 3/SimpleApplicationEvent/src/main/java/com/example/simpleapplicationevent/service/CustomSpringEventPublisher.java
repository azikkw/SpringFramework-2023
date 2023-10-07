package com.example.simpleapplicationevent.service;

import com.example.simpleapplicationevent.model.CustomSpringEvent;
import com.example.simpleapplicationevent.model.GenericSpringEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomSpringEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message) {
        System.out.println("Publishing custom event. ");
//        log.info("Publishing custom event. ");
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
//        System.out.println(customSpringEvent.getMessage());
        applicationEventPublisher.publishEvent(customSpringEvent);
    }

}
