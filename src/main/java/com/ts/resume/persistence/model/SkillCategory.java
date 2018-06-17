package com.ts.resume.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the skill_category database table.
 * 
 */
@Entity
@Table(name="skill_category")
@NamedQuery(name="SkillCategory.findAll", query="SELECT s FROM SkillCategory s")
public class SkillCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skill_category_id")
	private int skillCategoryId;

	@Column(name="skill_category_text")
	private String skillCategoryText;

	public SkillCategory() {
	}

	public int getSkillCategoryId() {
		return this.skillCategoryId;
	}

	public void setSkillCategoryId(int skillCategoryId) {
		this.skillCategoryId = skillCategoryId;
	}

	public String getSkillCategoryText() {
		return this.skillCategoryText;
	}

	public void setSkillCategoryText(String skillCategoryText) {
		this.skillCategoryText = skillCategoryText;
	}

}