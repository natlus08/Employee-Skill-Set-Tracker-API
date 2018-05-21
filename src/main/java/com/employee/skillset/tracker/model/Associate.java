/**
 * 
 */
package com.employee.skillset.tracker.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "ASSOCIATE_SKILL",
            joinColumns = @JoinColumn(name = "associate_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
	private Set<Skill> skills;
	
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

	public Set<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
