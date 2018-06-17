package com.ts.resume.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the education database table.
 * 
 */
@Entity
@NamedQuery(name="Education.findAll", query="SELECT e FROM Education e")
public class Education implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="education_id")
	private String educationId;

	private String degree;

	@Lob
	private String description;

	@Column(name="field_of_study")
	private String fieldOfStudy;

	@Column(name="from_year")
	private short fromYear;

	private String school;

	@Column(name="to_date")
	private byte toDate;

	@Column(name="to_year")
	private short toYear;

	//bi-directional many-to-one association to Resume
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;

	public Education() {
	}

	public String getEducationId() {
		return this.educationId;
	}

	public void setEducationId(String educationId) {
		this.educationId = educationId;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public short getFromYear() {
		return this.fromYear;
	}

	public void setFromYear(short fromYear) {
		this.fromYear = fromYear;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public byte getToDate() {
		return this.toDate;
	}

	public void setToDate(byte toDate) {
		this.toDate = toDate;
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