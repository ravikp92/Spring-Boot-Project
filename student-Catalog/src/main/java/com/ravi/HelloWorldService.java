package com.ravi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {
	
	@RequestMapping("/test")
	public String test() {
		return "Hello !! Ravi . Welcome to Spring boot !!";
	}

}
