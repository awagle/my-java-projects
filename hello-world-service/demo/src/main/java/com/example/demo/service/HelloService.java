package com.example.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

	@GetMapping(path = "/hello")
	public String sayHello(@RequestParam(required = false, defaultValue = "World") String input) {
		String retVal = String.format("Hello %s !", input);
			
		return retVal;
	}
	
}
