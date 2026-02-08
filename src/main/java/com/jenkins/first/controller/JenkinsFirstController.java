package com.jenkins.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsFirstController {

	@GetMapping("/")
    public String home() {
        return "Application deployed successfully";
    }

	@GetMapping("/hello")
	public String hello() {
		return "Hello, Jenkins!";
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test the Jenkins!";
	}
	
}
