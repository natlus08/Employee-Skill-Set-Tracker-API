/**
 * 
 */
package com.employee.skillset.tracker.service;

import java.util.List;

import com.employee.skillset.tracker.model.Associate;

/**
 * @author hameedu sultan
 *
 */
public interface AssociateService {
	
	List<Associate> getAssociates();

	Associate addAssociate(Associate associate);

	Associate editAssociate(Associate associate);

	void removeAssociate(Long id);

	Associate getAssociate(Long id);

}
