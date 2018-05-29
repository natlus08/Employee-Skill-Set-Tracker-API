package com.employee.skillset.tracker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.skillset.tracker.model.Associate;
import com.employee.skillset.tracker.model.AssociateSkill;
import com.employee.skillset.tracker.model.Skill;
import com.employee.skillset.tracker.repository.AssociateRepository;
import com.employee.skillset.tracker.repository.AssociateSkillRepository;
import com.employee.skillset.tracker.repository.SkillRepository;

/**
 * 
 * @author hameedu sultan
 *
 */
@Service
public class AssociateServiceImpl implements AssociateService{
	
	@Autowired
	private AssociateRepository associateRespository;
	
	@Autowired
	private SkillRepository skillRespository;
	
	@Autowired
	private AssociateSkillRepository associateSkillRespository;

	@Override
	public List<Associate> getAssociates() {
		return associateRespository.findAll();
	}

	@Override
	public Associate addAssociate(Associate associate) {
		Associate persistedAssociate = null;
		List<AssociateSkill> associateSkills = null;
		if(null != associate.getSkills() && !associate.getSkills().isEmpty()){
			associateSkills = new ArrayList<AssociateSkill>(associate.getSkills());
			associate.getSkills().clear();
		}
		persistedAssociate = associateRespository.save(associate);
		if (null != associateSkills && !associateSkills.isEmpty()){
			for (AssociateSkill associateSkill : associateSkills) {
				associateSkill.setAssociate(persistedAssociate);
			}
			persistedAssociate.getSkills().addAll(associateSkillRespository.saveAll(associateSkills));
		}		
		return persistedAssociate;		
	}

	@Override
	public Associate editAssociate(Associate associate) {
		if(associateRespository.existsById(associate.getId())){
			return associateRespository.save(associate);
		}
		return null;
	}

	@Override
	public void removeAssociate(Long id) {
		associateRespository.deleteById(id);	
	}

	@Override
	public Associate getAssociate(Long id) {
		Optional<Associate> associates = associateRespository.findById(id);
		if(associates.isPresent()){
			return associates.get();
		}
		return null;
	}

	@Override
	public List<AssociateSkill> getAssociateSkills() {
		return associateSkillRespository.findAll();
	}	

}
