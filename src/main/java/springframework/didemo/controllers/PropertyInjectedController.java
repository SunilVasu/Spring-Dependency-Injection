package springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import springframework.didemo.services.GreetingServiceImpl;

//this is the least preferred way to do DI
@Controller
public class PropertyInjectedController {
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
