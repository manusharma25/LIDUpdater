package com.poc.liupdator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CCILController {

	@GetMapping("/")
	public String ping() {
		return "Ping Success";
	}
}
