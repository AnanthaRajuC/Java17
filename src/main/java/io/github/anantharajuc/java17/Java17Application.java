package io.github.anantharajuc.java17;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class Java17Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Java17Application.class, args);

		log.info("Hello Java 17!");
	}
}
