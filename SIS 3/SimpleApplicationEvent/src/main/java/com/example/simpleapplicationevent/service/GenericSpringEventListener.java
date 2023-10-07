package com.example.simpleapplicationevent.service;

import com.example.simpleapplicationevent.model.GenericSpringEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class GenericSpringEventListener {

    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericSpringEvent event) throws InterruptedException {
//        log.info("Works");
        Thread.sleep(10000);
        System.out.println("Handling generic event (conditional) - " + event.getWhat());
    }

}

//public class GenericSpringEventListener implements ApplicationListener<GenericSpringEvent<String>> {
//
//    @Override
//    public void onApplicationEvent(@NonNull GenericSpringEvent<String> event) {
//        System.out.println("Received spring generic event - " + event.getWhat());
//    }
//}