package com.maven.maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/")
	public String holaMundo() {
		return "Hola mundo con Maven";
	}
}
