package com.example.simpeapplictaionevent2.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class UserCreatedEvent extends ApplicationEvent {

    private String name;

    public UserCreatedEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

}
