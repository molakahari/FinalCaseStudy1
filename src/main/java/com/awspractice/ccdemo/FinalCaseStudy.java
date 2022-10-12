package com.awspractice.ccdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FinalCaseStudy {

	@GetMapping("")
	public String sayHello() {
		return "Hi i'm from final case study";
	}
	@GetMapping("/name")
	public String add() {
		return "My name is sayHello() created for final case stusy";
	}
}
