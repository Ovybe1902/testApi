package com.example.restservice;

import java.util.HashMap;
// import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",
            methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS},
            allowedHeaders = "*")
@RestController
public class GreetingController {

	// private static final String template = "Hello, %s!";
	// private final AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public HashMap<String, String> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		HashMap<String, String> map = new HashMap<String, String>(); 
		map.put("nom", "Raitra");
		map.put("age", "12 ans");
		map.put("origin", "Ambatondrazaka");
		return map;
	}
}
