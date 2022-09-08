package com.example.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sample {
	@GetMapping("/")
	public String sample() {
		return "<h1>hell welcome</h1>";
	}

}
