package com.example.simpleapplicationevent.service;

import com.example.simpleapplicationevent.model.GenericSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GenericSpringEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishGenericEvent(final String message) {
        System.out.println("Publishing generic event. ");
        GenericSpringEvent<String> genericSpringEvent = new GenericSpringEvent<String>(message, true);
        applicationEventPublisher.publishEvent(genericSpringEvent);
    }
}
