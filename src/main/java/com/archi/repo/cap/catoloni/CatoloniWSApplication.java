package com.archi.repo.cap.catoloni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CatoloniWSApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CatoloniWSApplication.class);
    }

	/**
	 * Surcharger le fichier de configuration : --spring.config.location=<full-path-file>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CatoloniWSApplication.class, args);
	}
}