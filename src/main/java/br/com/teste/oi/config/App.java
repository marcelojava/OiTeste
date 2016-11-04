package br.com.teste.oi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.teste.oi")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
