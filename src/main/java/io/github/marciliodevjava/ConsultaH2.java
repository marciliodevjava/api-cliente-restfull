package io.github.marciliodevjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConsultaH2 extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaH2.class, args);
	}
}