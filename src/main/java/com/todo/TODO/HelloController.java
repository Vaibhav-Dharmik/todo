package com.todo.TODO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return("<h1>Hello World</h1>");
	}
}
