package com.curso.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {

	@GetMapping
	public String index() {
		return "/home";
	}
	
	@GetMapping("/departamentos/cadastrar")
	public String createDepartamento() {
		return "/departamento/cadastro";
	}
	
	@GetMapping("/departamentos/listar")
	public String listaDepartamento() {
		return "/departamento/lista";
	}
}
