package com.restapi.partone.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hellocontroller")
public class SuhelController {

	
	@GetMapping("/helloget")
	public String hello() {
		
		
	return "Hello";
	}
}
