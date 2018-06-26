package com.ts.resume.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the skill database table.
 * 
 */
@Entity
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skill_id")
	private Long skillId;

	@Lob
	private String description;

	@Column(name="skill_level_id")
	private byte skillLevelId;

	@Column(name="skill_name")
	private String skillName;

	//bi-directional many-to-one association to Resume
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;

	//uni-directional many-to-one association to SkillCategory
	@ManyToOne
	@JoinColumn(name="skill_category_id")
	private SkillCategory skillCategory;

	public Skill() {
	}

	public Long getSkillId() {
		return this.skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getSkillLevelId() {
		return this.skillLevelId;
	}

	public void setSkillLevelId(byte skillLevelId) {
		this.skillLevelId = skillLevelId;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Resume getResume() {
		return this.resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public SkillCategory getSkillCategory() {
		return this.skillCategory;
	}

	public void setSkillCategory(SkillCategory skillCategory) {
		this.skillCategory = skillCategory;
	}

}