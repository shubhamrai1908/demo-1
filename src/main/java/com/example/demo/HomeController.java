package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@GetMapping("/api")
	@ResponseBody()
	public String fun() {
		return "HELLO Ankita, How are you!";
	}

}
