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
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pk.associate")
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

	public List<AssociateSkill> getSkills() {
		return skills;
	}

	public void setSkills(List<AssociateSkill> skills) {
		this.skills = skills;
	}
	
	
	
}
