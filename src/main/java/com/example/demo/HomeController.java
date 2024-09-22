package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@CrossOrigin(origins = "https://react-app-production-441e.up.railway.app")
	@GetMapping("/api")
	@ResponseBody()
	public String fun() {
		return "HELLO Shivam, How are you!";
	}

}
