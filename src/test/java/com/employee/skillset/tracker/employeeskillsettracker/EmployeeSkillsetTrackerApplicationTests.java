package com.employee.skillset.tracker.employeeskillsettracker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.skillset.tracker.boot.EmployeeSkillsetTrackerApplication;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = EmployeeSkillsetTrackerApplication.class)
@ContextConfiguration
@ActiveProfiles("local")
public class EmployeeSkillsetTrackerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
