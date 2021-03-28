package com.ernando.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/serv1")
@CrossOrigin("*")
public class Service1Controller {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping
	public ResponseEntity<?> getDataFromService2() {
		System.out.println("Service1 Controller Called");
		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://service2/serv2",
				String.class);
		return ResponseEntity.ok().body("Recieved Message: " + responseEntity.getBody());
	}
}
