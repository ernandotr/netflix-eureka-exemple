package com.ernando.eureka.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("serv2")
@CrossOrigin("*")
public class Service2Controller {
	@GetMapping
	public ResponseEntity<?> getData() {
		System.out.println("Service2 Controller Called");
		return ResponseEntity.ok().body("Service 2 says hi");
	}
}
