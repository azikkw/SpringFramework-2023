package com.example.simpeapplictaionevent2.service;

import com.example.simpeapplictaionevent2.model.ReturnedEvent;
import com.example.simpeapplictaionevent2.model.UserRemovedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class UserRemovedListener {

    @EventListener
    ReturnedEvent handleUserRemovedEvent(UserRemovedEvent event) {
        System.out.println("User removed (@EventListener) - " + event.getName());
        return new ReturnedEvent();
    }

    @EventListener
    @Async
    void handleReturnedEvent(ReturnedEvent event) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("ReturnedEvent received.");
    }

    @EventListener(condition = "#event.name eq 'Genius'")
    void handleConditionalListener(UserRemovedEvent event) {
        System.out.println("User removed (Conditional) - " + event.getName());
    }

    @TransactionalEventListener(condition = "#event.name eq 'Alex'", phase = TransactionPhase.AFTER_COMPLETION)
    void handleAfterUserRemoved(UserRemovedEvent event) throws InterruptedException {
//        Thread.sleep(10000);
        System.out.println("User removed (Conditional + @TransactionalEventListener) - " + event.getName());
    }

}
