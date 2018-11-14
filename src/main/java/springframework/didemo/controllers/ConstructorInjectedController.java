package springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import springframework.didemo.services.GreetingService;

/*
This is the most preferred way
	Types of DI : Example of DI without Spring
	1) By Class propertes - least preferred [using private property is evil] => PropertyInjectedController.java
	2) By Setters - Area of much debate => SetterInjectedController.java
	3) By Constructor - Most preferred => ConstructorInjectedController.java
*/
@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
