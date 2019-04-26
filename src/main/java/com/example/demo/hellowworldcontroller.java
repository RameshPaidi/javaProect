package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hellowworldcontroller {
	@GetMapping("/firstproject")
    public String sayHello() {
        return "This is Ramesh Chowdary Project..........";
    }
}


