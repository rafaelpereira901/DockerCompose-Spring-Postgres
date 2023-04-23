package com.lad_corp.dockerspring.service;

import org.springframework.stereotype.Service;

import com.lad_corp.dockerspring.model.Test;
import com.lad_corp.dockerspring.repository.TestRepository;

@Service
public class TestService {

	private TestRepository testRepository;
	
	public TestService(TestRepository testRepository) {
		this.testRepository = testRepository;
	}
	
	public Test createTest(Test test) {
		testRepository.save(test);
		return test;
	}

}
