package com.employee.skillset.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.skillset.tracker.model.Associate;
import com.employee.skillset.tracker.repository.AssociateRepository;

/**
 * 
 * @author hameedu sultan
 *
 */
@Service
public class AssociateServiceImpl implements AssociateService{
	
	@Autowired
	private AssociateRepository associateRespository;

	@Override
	public List<Associate> getAssociates() {
		return associateRespository.findAll();
	}

	@Override
	public Associate addAssociate(Associate associate) {
		return associateRespository.save(associate);
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

}
