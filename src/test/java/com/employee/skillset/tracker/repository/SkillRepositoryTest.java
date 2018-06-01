/**
 * 
 */
package com.employee.skillset.tracker.repository;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import com.employee.skillset.tracker.boot.EmployeeSkillsetTrackerApplication;
import com.employee.skillset.tracker.configuration.JpaConfiguration;
import com.employee.skillset.tracker.model.Skill;

/**
 * @author hameedu Sultan
 *
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
@ContextConfiguration(classes={EmployeeSkillsetTrackerApplication.class, JpaConfiguration.class})
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class SkillRepositoryTest {
	
	 @Autowired
	 private TestEntityManager entityManager;
	 
	 @Autowired
	 private SkillRepository skillRepository;
	 
	 @Test
	 public void whenFindById_thenReturnSkill() {
	     // given
	     Skill java = new Skill();
	     java.setName("JAVA");	     
	     entityManager.persist(java);
	     entityManager.flush();
	     // when
	     Optional<Skill> found = skillRepository.findById(new Long(6));
	     // then
	     assertEquals(found.get().getName(), java.getName());	     
	 }
	 
	 @Test
	 public void findAll() {
		 List<Skill> skills = skillRepository.findAll();
	     
	     assertEquals(skills.size(), 5);
	 }

}
