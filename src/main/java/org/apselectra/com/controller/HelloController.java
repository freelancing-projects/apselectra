package org.apselectra.com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

/*	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}*/
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
//		model.put("message", this.message);
		return "index";
	}

	
	@RequestMapping("/{page}")
	public String otherPages(@PathVariable String page) {
//		model.put("message", this.message);
		return page;
	}
}