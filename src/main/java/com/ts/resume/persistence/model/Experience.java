package com.ts.resume.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the experience database table.
 * 
 */
@Entity
@NamedQuery(name="Experience.findAll", query="SELECT e FROM Experience e")
public class Experience implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="experience_id")
	private String experienceId;

	@Column(name="company_name")
	private String companyName;

	@Column(name="from_month")
	private byte fromMonth;

	@Column(name="from_year")
	private short fromYear;

	@Column(name="position_held")
	private String positionHeld;

	@Column(name="to_month")
	private byte toMonth;

	@Column(name="to_year")
	private short toYear;

	//bi-directional many-to-one association to Resume
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;

	public Experience() {
	}

	public String getExperienceId() {
		return this.experienceId;
	}

	public void setExperienceId(String experienceId) {
		this.experienceId = experienceId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public byte getFromMonth() {
		return this.fromMonth;
	}

	public void setFromMonth(byte fromMonth) {
		this.fromMonth = fromMonth;
	}

	public short getFromYear() {
		return this.fromYear;
	}

	public void setFromYear(short fromYear) {
		this.fromYear = fromYear;
	}

	public String getPositionHeld() {
		return this.positionHeld;
	}

	public void setPositionHeld(String positionHeld) {
		this.positionHeld = positionHeld;
	}

	public byte getToMonth() {
		return this.toMonth;
	}

	public void setToMonth(byte toMonth) {
		this.toMonth = toMonth;
	}

	public short getToYear() {
		return this.toYear;
	}

	public void setToYear(short toYear) {
		this.toYear = toYear;
	}

	public Resume getResume() {
		return this.resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

}