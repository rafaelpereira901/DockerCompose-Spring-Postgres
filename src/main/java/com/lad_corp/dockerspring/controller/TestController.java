package com.lad_corp.dockerspring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lad_corp.dockerspring.model.Test;
import com.lad_corp.dockerspring.service.TestService;

@RestController
@RequestMapping("/api/test")
public class TestController {
	
	private TestService testService;
	
	public TestController (TestService testService) {
		this.testService = testService;
	}

	@PostMapping 
	public ResponseEntity<Test> createExercise(@RequestBody Test test){
		return new ResponseEntity<Test>(testService.createTest(test), HttpStatus.CREATED);
	}

	
}
