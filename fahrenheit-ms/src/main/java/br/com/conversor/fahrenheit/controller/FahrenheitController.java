package br.com.conversor.fahrenheit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fahrenheit")
public class FahrenheitController {
	
	
	@GetMapping("/{C}")
	public Double converter(@PathVariable Double C) {
		Double F = ((9/5.0) * C) + 32;
		
		return F;
	}
}
