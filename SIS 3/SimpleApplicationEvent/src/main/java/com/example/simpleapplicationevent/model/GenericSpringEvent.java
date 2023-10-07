package com.example.simpleapplicationevent.model;

import lombok.Getter;

@Getter
public class GenericSpringEvent<T> {

    private T what;
    protected boolean success;

    public GenericSpringEvent(T what, boolean success) {
        this.what = what;
        this.success = success;
    }

}
