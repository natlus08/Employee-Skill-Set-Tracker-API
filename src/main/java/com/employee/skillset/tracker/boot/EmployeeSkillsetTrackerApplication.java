package com.employee.skillset.tracker.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.employee.skillset.tracker" })
public class EmployeeSkillsetTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSkillsetTrackerApplication.class, args);
	}
}
