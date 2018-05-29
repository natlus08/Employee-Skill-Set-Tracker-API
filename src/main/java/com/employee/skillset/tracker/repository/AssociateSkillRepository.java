/**
 * 
 */
package com.employee.skillset.tracker.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.skillset.tracker.model.AssociateSkill;

/**
 * @author hameedu sultan
 *
 */
@Transactional
public interface AssociateSkillRepository extends JpaRepository<AssociateSkill, Long> {

}
