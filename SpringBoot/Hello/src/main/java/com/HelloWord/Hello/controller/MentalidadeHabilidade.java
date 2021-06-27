package com.HelloWord.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Mentalidade")
public class MentalidadeHabilidade {
	@GetMapping
	public String MentalidadeHabilidade() {
		return "Persistência e Atenção aos detalhes!!!";
	}
}



