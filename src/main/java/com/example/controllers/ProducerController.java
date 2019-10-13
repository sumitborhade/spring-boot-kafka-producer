package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.ProducerService;

@RestController
@RequestMapping(value="/kafka")
public class ProducerController {

	@Autowired
	private ProducerService producerService;
	
	@GetMapping(value="/producer", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User producer(@RequestParam(name = "name") String name,
					@RequestParam(name = "message") String message) {
		User user = new User();
		user.setMessage(message);
		user.setName(name);
		
		producerService.publishMessage(user);
		return user;
	}
}
