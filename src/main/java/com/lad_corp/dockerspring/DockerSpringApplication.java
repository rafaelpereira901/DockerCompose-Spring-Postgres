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
		
		Events ev1 = new Events(1,"Primeira Evento", "descrição 1...","2022-04-02T09:00:00Z","09:00:00","11:00:00",true);
		Events ev2 = new Events(2, "Segundo Evento", "descrição 2...","2022-04-17T15:00:00Z","15:00:00","17:00:00",false);
		Events ev3 = new Events(3, "Terceiro Evento", "descrição 3...","2022-04-30T20:00:00Z","18:00:00","20:00:00",true);
		
		return new ResponseEntity<>(Arrays.asList(ev1, ev2,ev3) , HttpStatus.OK);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringApplication.class, args);
	}

}
