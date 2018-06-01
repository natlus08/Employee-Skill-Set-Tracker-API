/**
 * 
 */
package com.employee.skillset.tracker.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.skillset.tracker.boot.EmployeeSkillsetTrackerApplication;
import com.employee.skillset.tracker.configuration.JpaConfiguration;
import com.employee.skillset.tracker.model.Skill;
import com.employee.skillset.tracker.repository.SkillRepository;

/**
 * @author hameedu sultan
 *
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
@ContextConfiguration(classes={EmployeeSkillsetTrackerApplication.class, JpaConfiguration.class})
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class SkillServiceImplTest {
	
	@TestConfiguration
    static class SkillServiceImplTestContextConfiguration {
  
        @Bean
        public SkillService skillService() {
            return new SkillServiceImpl();
        }
    }
	
	@Autowired
	private SkillService skillService;
	
	@MockBean
	private SkillRepository skillRespository;
	
	@Before
	public void setUp() {
	    Skill skill = new Skill();
	    skill.setName("java");
	    skill.setId(new Long(1));
	    
	    List<Skill> skills = new ArrayList<Skill>();
	    skills.add(skill);
	 
	    Mockito.when(skillRespository.findAll())
	      .thenReturn(skills);
	}
	
	@Test
	public void skillsShouldBeReturned() {
	    String name = "java";
	    List<Skill> found = skillService.getSkills();
	    	assertEquals(found.get(0).getName(), name);
	 }
	
}
