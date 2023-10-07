package com.example.simpleapplicationevent.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomSpringService {

    @Autowired
    private CustomSpringEventPublisher customSpringEventPublisher;
    @Autowired
    private GenericSpringEventPublisher genericSpringEventPublisher;

    public String print(String message) {
        if(message.equals("test1")) {
            customSpringEventPublisher.publishCustomEvent(message);
        } else if(message.equals("test2")) genericSpringEventPublisher.publishGenericEvent(message);

        return message;
    }

}
