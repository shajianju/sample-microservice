package com.eurekka.server.NamingServer.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerControll {
	@GetMapping("/sanmpl")
	//@Retry(name=default,fallback="method name")--Need to add dependencies
	public String sampleApi() {
		return new RestTemplate().getForEntity("", String.class).toString();
	}

	
	//This method invokes when there is any error happens for fallback
	public String sampleResponse(Exception e) {
		return "Error Handled";
	}
}
