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
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author hameedu sultan
 *
 */
@Entity
@Table(name="ASSOCIATES")
public class Associate {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="associate_id")
	private Long id;
	
	private String name;
	
	private String gender;
	
	@Column(unique = true)
	private String email;
	
	private String mobile;
	
	@Lob
    @Column(columnDefinition="blob")
	private byte[] image;
	
	private String status;
	
	private String level;
	
	private String remark;
	
	private String strength;
	
	private String weakness;
	
	@OneToMany(mappedBy = "associate")
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public Set<AssociateSkill> getSkills() {
		return skills;
	}

	public void setSkills(Set<AssociateSkill> skills) {
		this.skills = skills;
	}
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
