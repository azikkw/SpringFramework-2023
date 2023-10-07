package com.example.simpeapplictaionevent2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SimpeApplictaionEvent2Application {

	public static void main(String[] args) {
//		SpringApplication.run(SimpeApplictaionEvent2Application.class, args);

		SpringApplication springApplication = new SpringApplication(SimpeApplictaionEvent2Application.class);
		springApplication.addListeners(new SpringBuiltInEventsListener());
		springApplication.run(args);
	}

}
