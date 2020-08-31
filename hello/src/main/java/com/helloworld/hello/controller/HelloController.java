package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Que papel seus grupos organizados têm em sua vida? São importantes? Você gosta de se reunir com eles? Por que?"
				+ "\r\n\r\nMeus grupos organizados fazem uma diferença grande na minha vida, pois são o que me ajudam a passar pelas dificuldades em geral da vida.";
	}
}
