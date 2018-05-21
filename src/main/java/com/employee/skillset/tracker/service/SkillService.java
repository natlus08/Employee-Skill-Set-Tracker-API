/**
 * 
 */
package com.employee.skillset.tracker.service;

import java.util.List;

import com.employee.skillset.tracker.model.Skill;


/**
 * @author hus8623
 *
 */
public interface SkillService {
	
	List<Skill> getSkills();

	Skill addSkill(Skill skill);

	Skill editSkill(Skill skill);

	void removeSkill(Long id);

}
