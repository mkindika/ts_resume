package com.ts.resume.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the resume database table.
 * 
 */
@Entity
@NamedQuery(name="Resume.findAll", query="SELECT r FROM Resume r")
public class Resume implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="resume_id")
	private String resumeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on_time")
	private Date createdOnTime;

	@Column(name="last_accessed_time")
	private Timestamp lastAccessedTime;

	@Column(name="resume_name")
	private String resumeName;

	//bi-directional many-to-one association to Certificate
	@OneToMany(mappedBy="resume")
	private List<Certificate> certificates;

	//bi-directional many-to-one association to Education
	@OneToMany(mappedBy="resume")
	private List<Education> educations;

	//bi-directional many-to-one association to Experience
	@OneToMany(mappedBy="resume")
	private List<Experience> experiences;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	//bi-directional many-to-one association to Skill
	@OneToMany(mappedBy="resume")
	private List<Skill> skills;

	public Resume() {
	}

	public String getResumeId() {
		return this.resumeId;
	}

	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}

	public Date getCreatedOnTime() {
		return this.createdOnTime;
	}

	public void setCreatedOnTime(Date createdOnTime) {
		this.createdOnTime = createdOnTime;
	}

	public Timestamp getLastAccessedTime() {
		return this.lastAccessedTime;
	}

	public void setLastAccessedTime(Timestamp lastAccessedTime) {
		this.lastAccessedTime = lastAccessedTime;
	}

	public String getResumeName() {
		return this.resumeName;
	}

	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}

	public List<Certificate> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public Certificate addCertificate(Certificate certificate) {
		getCertificates().add(certificate);
		certificate.setResume(this);

		return certificate;
	}

	public Certificate removeCertificate(Certificate certificate) {
		getCertificates().remove(certificate);
		certificate.setResume(null);

		return certificate;
	}

	public List<Education> getEducations() {
		return this.educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public Education addEducation(Education education) {
		getEducations().add(education);
		education.setResume(this);

		return education;
	}

	public Education removeEducation(Education education) {
		getEducations().remove(education);
		education.setResume(null);

		return education;
	}

	public List<Experience> getExperiences() {
		return this.experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public Experience addExperience(Experience experience) {
		getExperiences().add(experience);
		experience.setResume(this);

		return experience;
	}

	public Experience removeExperience(Experience experience) {
		getExperiences().remove(experience);
		experience.setResume(null);

		return experience;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public Skill addSkill(Skill skill) {
		getSkills().add(skill);
		skill.setResume(this);

		return skill;
	}

	public Skill removeSkill(Skill skill) {
		getSkills().remove(skill);
		skill.setResume(null);

		return skill;
	}

}