package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getDemo() {
		return "Test";
	}
}
