/**
 * 
 */
package com.employee.skillset.tracker.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author hameedu sultan
 *
 */
@Entity
@Table(name = "ASSOCIATE_SKILL")
@AssociationOverrides({
	@AssociationOverride(name = "pk.associate", 
		joinColumns = @JoinColumn(name = "associate_id")),
	@AssociationOverride(name = "pk.skill", 
		joinColumns = @JoinColumn(name = "skill_id")) })
public class AssociateSkill {
	
	@EmbeddedId
    private AssociateSkillId pk = new AssociateSkillId();
	
	@Max(value=20)
	private Integer level;
	
	@JsonIgnore
	public Associate getAssociate() {
		return pk.getAssociate();
	}

	public void setAssociate(Associate associate) {
		pk.setAssociate(associate);
	}
 
	public Skill getSkill() {
		return pk.getSkill();
	}

	public void setSkill(Skill skill) {
		pk.setSkill(skill);
	}
	

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	

}
