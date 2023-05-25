package io.github.kawajava.portiernia2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Portiernia2023Application {

	public static void main(String[] args) {
		SpringApplication.run(Portiernia2023Application.class, args);
	}

}
