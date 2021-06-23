package com.HelloWord.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivo")
public class ObjetivosdeAprendizagem {


	@GetMapping
	public String ObjetivosdeAprendizagem () {
		return "Melhorar a cada dia, conseguir aprender e por em prática os ensinamentos!!!";
	}
}
