package com.awspractice.ccdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FinalCaseStudy {

	  @GetMapping("")
    public String sayHello() {
        return "Hi i'm from final case study production deployment testing on manual approval";
    }
    @GetMapping("/name")
    public String add() {
        return "My name is sayHello() created for final case stusy";
    }
    @GetMapping("/purpose")
    public String hello() {
        return "Testing & Demo purpose";
    }
}
