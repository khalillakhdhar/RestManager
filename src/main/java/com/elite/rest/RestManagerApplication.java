package com.elite.rest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestManagerApplication.class, args);
	}
	
@Bean
public ModelMapper  modelMapper()
{
return new ModelMapper();	
}
}
