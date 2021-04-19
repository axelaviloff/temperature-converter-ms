package br.com.conversor.converter.feignclientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "fahrenheit-ms", path = "/fahrenheit")
public interface FahrenheitFeignClient {
	@GetMapping("/{C}")
	public Double converter(@PathVariable Double C);

}
