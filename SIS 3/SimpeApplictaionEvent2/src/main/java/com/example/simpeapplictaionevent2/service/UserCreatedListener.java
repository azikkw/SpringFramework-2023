package com.example.simpeapplictaionevent2.service;

import com.example.simpeapplictaionevent2.model.UserCreatedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {

    @Override
    public void onApplicationEvent(UserCreatedEvent event) {
        System.out.println("UserCreatedEvent handled - " + event.getName());
    }

}
