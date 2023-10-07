package com.example.simpeapplictaionevent2.service;

import com.example.simpeapplictaionevent2.model.UserCreatedEvent;
import com.example.simpeapplictaionevent2.model.UserRemovedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    private final ApplicationEventPublisher publisher;

    public Publisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent() {
//        publisher.publishEvent(new UserCreatedEvent(this, name));
//        publisher.publishEvent(new UserRemovedEvent(name));

        publisher.publishEvent(new UserCreatedEvent(this, "Genius"));
        publisher.publishEvent(new UserRemovedEvent("Genius"));

        publisher.publishEvent(new UserCreatedEvent(this, "Alex"));
        publisher.publishEvent(new UserRemovedEvent("Alex"));
    }

}
