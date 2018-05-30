/**
 * 
 */
package com.employee.skillset.tracker.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.skill")
	@JsonIgnore
	private List<AssociateSkill> skills = new ArrayList<AssociateSkill>();

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

	public List<AssociateSkill> getSkills() {
		return skills;
	}

	public void setSkills(List<AssociateSkill> skills) {
		this.skills = skills;
	}

	

}
