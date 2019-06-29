package com.pma.pma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class PmaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PmaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	       return application.sources(PmaApplication.class);
	}
}
