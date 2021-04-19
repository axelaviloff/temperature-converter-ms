package br.com.conversor.kelvin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class KelvinMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KelvinMsApplication.class, args);
	}

}
