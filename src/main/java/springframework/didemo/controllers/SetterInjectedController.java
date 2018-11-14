package springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import springframework.didemo.services.GreetingService;

@Controller
public class SetterInjectedController {
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
