/**
 * 
 */
package com.employee.skillset.tracker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.skillset.tracker.model.Skill;
import com.employee.skillset.tracker.service.SkillService;

/**
 * @author hameedu sultan
 *
 */
@RestController
@RequestMapping("/skill-api/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class SkillController {
	
	public static final Logger logger = LoggerFactory.getLogger(SkillController.class);
	
	@Autowired
	private SkillService skillService;
	
	/**
	 * GET --> Get all skills
	 */
	@GetMapping("/skills")
	public ResponseEntity<List<Skill>> getSkills() {
		List<Skill> skills = skillService.getSkills();
		if (skills.isEmpty()) {
			return new ResponseEntity<List<Skill>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Skill>>(skills, HttpStatus.OK);
	}
	
	/**
	 * POST --> Add a Skill
	 */
	@PostMapping("/skill")
	public ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {
		Skill newSkill = skillService.addSkill(skill);
		if (null == newSkill) {
			return new ResponseEntity<Skill>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Skill>(newSkill, HttpStatus.CREATED);
	}
	
	/**
	 * PUT --> Edit a skill
	 */
	@PutMapping("/skill")
	public ResponseEntity<Skill> editSkill(@RequestBody Skill skill) {
		Skill newSkill = skillService.editSkill(skill);
		if (null == newSkill) {
			return new ResponseEntity<Skill>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Skill>(newSkill, HttpStatus.CREATED);
	}
	
	/**
	 * Delete --> remove a skill
	 */
	@DeleteMapping("/skill/{id}")
	public ResponseEntity<Skill> editSkill(@PathVariable Long id) {
		skillService.removeSkill(id);
		return new ResponseEntity<Skill>(HttpStatus.OK);
	}

}
