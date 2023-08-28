package com.example.nikinho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class NikinhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NikinhoApplication.class, args);
	}
	@GetMapping("/nikinho")
	public String hello(){
		return "Seja bem vindo Nikinho!";
	}

}
