package com.example.simpleapplicationevent.service;

import com.example.simpleapplicationevent.model.CustomSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent cse) {
        System.out.println("Handling context re-freshed event. ");
    }

//    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
//    public void handleCustom(CustomSpringEvent event) {
//        System.out.println("Handling event inside a transaction BEFORE COMMIT.");
//    }

}
