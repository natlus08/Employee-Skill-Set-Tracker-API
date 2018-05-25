/**
 * 
 */
package com.employee.skillset.tracker.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author hameedu sultan
 *
 */
@Entity
@Table(name = "ASSOCIATE_SKILL")
public class AssociateSkill {
	
	@Id
    @GeneratedValue
    private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "associate_id")
	@JsonIgnore
	private Associate associate;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id")
	private Skill skill;
	
	@Max(value=20)
	private Integer level;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Associate getAssociate() {
		return associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}
