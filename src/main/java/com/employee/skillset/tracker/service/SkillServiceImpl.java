/**
 * 
 */
package com.employee.skillset.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.skillset.tracker.model.Skill;
import com.employee.skillset.tracker.repository.SkillRepository;

/**
 * @author hameedu sultan
 *
 */
@Service
public class SkillServiceImpl implements SkillService {
	
	@Autowired
	private SkillRepository skillRespository;

	@Override
	public List<Skill> getSkills() {
		return skillRespository.findAll();
	}

	@Override
	public Skill addSkill(Skill skill) {
		return skillRespository.save(skill);
	}

	@Override
	public Skill editSkill(Skill skill) {
		if (skillRespository.existsById(skill.getId())) {
			return skillRespository.save(skill);
		}
		return null;
	}

	@Override
	public void removeSkill(Long id) {
		skillRespository.deleteById(id);
	}
}
