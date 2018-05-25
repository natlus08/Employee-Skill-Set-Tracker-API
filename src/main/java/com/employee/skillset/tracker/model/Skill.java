/**
 * 
 */
package com.employee.skillset.tracker.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author hameedu sultan
 *
 */
@Entity
@Table(name="SKILLS")
public class Skill {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="skill_id")
	private Long id;
	
	@NotNull
	@Column(name="skill_name")
	private String name;
	
	@OneToMany(mappedBy = "skill")
	@JsonIgnore
	private Set<AssociateSkill> skills = new HashSet<AssociateSkill>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<AssociateSkill> getSkills() {
		return skills;
	}

	public void setSkills(Set<AssociateSkill> skills) {
		this.skills = skills;
	}	

}
