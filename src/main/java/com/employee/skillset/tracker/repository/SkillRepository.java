/**
 * 
 */
package com.employee.skillset.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.employee.skillset.tracker.model.Skill;

/**
 * @author hus8623
 *
 */
@Transactional
public interface SkillRepository extends JpaRepository<Skill, Long>{

}
