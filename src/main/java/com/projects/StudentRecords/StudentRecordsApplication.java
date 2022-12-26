package com.projects.StudentRecords;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class StudentRecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRecordsApplication.class, args);
	}

}
