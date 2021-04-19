package br.com.conversor.fahrenheit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FahrenheitMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FahrenheitMsApplication.class, args);
	}

}
