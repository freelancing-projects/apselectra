package org.apselectra.com.controller;

import java.util.Map;

import org.apselectra.com.dto.ContactInfo;
import org.apselectra.com.service.EmailService;
import org.apselectra.com.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@Autowired
	private EmailService emailService;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		return "index";
	}

	@RequestMapping("/{page}")
	public String otherPages(@PathVariable String page) {
		return page;
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestBody ContactInfo contact){
		System.out.println(contact.getName());
		return "contact";
	}
	
}