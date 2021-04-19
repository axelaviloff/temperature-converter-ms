package br.com.conversor.converter.controller;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.conversor.converter.feignclientes.FahrenheitFeignClient;
import br.com.conversor.converter.feignclientes.KelvinFeignClient;

@RestController
@RequestMapping("converter")
public class ConverterController {
	
	@Autowired
	private KelvinFeignClient kelvinFeignClient;
	
	@Autowired
	private FahrenheitFeignClient fahrenheitFeignClient;
	
	@GetMapping("/{C}")
	public String converter(@PathVariable Double C) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		Double K = kelvinFeignClient.converter(C);
		Double F = fahrenheitFeignClient.converter(C);
		
		return "Fahrenheit: " + formatter.format(F) + "\nKelvin: " + formatter.format(K);
		
	}
	
	
}
