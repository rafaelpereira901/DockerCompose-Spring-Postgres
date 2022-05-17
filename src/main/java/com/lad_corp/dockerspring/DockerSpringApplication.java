package com.lad_corp.dockerspring;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringApplication {

	@CrossOrigin
	@RequestMapping("/")
	public ResponseEntity<List<Events>> home() {
		
		Events ev1 = new Events(1,"Primeira Evento", "descrição 1 descrição 1");
		Events ev2 = new Events(2, "Segundo Evento", "descrição 2 descrição 2");
		Events ev3 = new Events(3, "Terceiro Evento", "descrição 3 descrição 3");
		
		return new ResponseEntity<>(Arrays.asList(ev1, ev2,ev3) , HttpStatus.OK);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringApplication.class, args);
	}

}
