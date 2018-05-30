/**
 * 
 */
package com.employee.skillset.tracker.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * @author hus8623
 *
 */
@Embeddable
public class AssociateSkillId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2472355652384336115L;

	@ManyToOne
	private Associate associate;

	@ManyToOne
	private Skill skill;

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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		AssociateSkillId that = (AssociateSkillId) o;
		return Objects.equals(associate, that.associate)
				&& Objects.equals(skill, that.skill);
	}

	@Override
	public int hashCode() {
		return Objects.hash(associate, skill);
	}
}
