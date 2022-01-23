package com.example.demo.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.User;

@RestController
public class FirstController {
	
	@GetMapping("/mypage")
	public String view() {
		return "hello";
	}
	
	@PostMapping("/myname")
    public String msg(@RequestParam(value = "user") String name, @RequestParam(value = "last") String lName) {
            return "post method " + name +" "+ lName;
    }

	@PostMapping("/path/{name}")
    public String path(@PathVariable String name) {
            return name;
    } 

	
}
