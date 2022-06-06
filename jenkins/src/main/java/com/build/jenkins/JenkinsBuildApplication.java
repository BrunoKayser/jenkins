package com.build.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsBuildApplication {

	public static void main(String[] args) {
		System.out.println("Passou aqui");
		SpringApplication.run(JenkinsBuildApplication.class, args);
	}

}
