package br.com.tiagopedroso.marioapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarioApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarioApiApplication.class, args);
		System.out.println("\nA API iniciou corretamente :D\n");
	}

}
