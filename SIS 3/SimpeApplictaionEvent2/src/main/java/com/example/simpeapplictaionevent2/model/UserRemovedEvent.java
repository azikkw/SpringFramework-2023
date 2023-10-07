package com.example.simpeapplictaionevent2.model;

import lombok.Getter;

@Getter
public class UserRemovedEvent {

    private String name;

    public UserRemovedEvent(String name) {
        this.name = name;
    }

}
