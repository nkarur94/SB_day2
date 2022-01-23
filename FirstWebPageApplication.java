package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstWebPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstWebPageApplication.class, args);
	}
	@PostMapping("/myname")
    public String msg(@RequestParam(value = "user") String name, @RequestParam(value = "last") String lName) {
            return "post method " + name +" "+ lName;
    }


}
