/**
 * 
 */
package com.employee.skillset.tracker.controller;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.employee.skillset.tracker.boot.EmployeeSkillsetTrackerApplication;
import com.employee.skillset.tracker.configuration.JpaConfiguration;
import com.employee.skillset.tracker.model.Skill;
import com.employee.skillset.tracker.service.SkillService;

/**
 * @author hameedu sultan
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(SkillController.class)
@ActiveProfiles("local")
@ContextConfiguration(classes={EmployeeSkillsetTrackerApplication.class, JpaConfiguration.class})
public class SkillControllerTest {
	@Autowired
    private MockMvc mvc;
	
	@MockBean
    private SkillService service;
	
	@Test
	public void givenEmployees_whenGetEmployees_thenReturnJsonArray()
	  throws Exception {
	     
	    Skill skill = new Skill();
	    skill.setName("Jenkins");
	    
	 
	    List<Skill> skills = Arrays.asList(skill);
	 
	    given(service.getSkills()).willReturn(skills);
	 
	    mvc.perform(get("/skill-api/skills")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(jsonPath("$", hasSize(1)))
	      .andExpect(jsonPath("$[0].name", is(skill.getName())));
	}

}
