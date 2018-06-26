package com.ts.resume.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * The persistent class for the peronal_info database table.
 * 
 */
@Entity
@Table(name="personal_info")
@NamedQuery(name="PersonalInfo.findAll", query="SELECT p FROM PersonalInfo p")
public class PersonalInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="peronal_info_id")
	private Long peronalInfoId;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="home_phone")
	private String homePhone;

	@Column(name="last_name")
	private String lastName;

	private String mobile;

	@Column(name="name_in_full")
	private String nameInFull;
	
	private Date dob;

	@Lob
	@Column(name="profile_summary")
	private String profileSummary;

	private String title;

	//uni-directional many-to-one association to Address
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="address_id")
	private Address address;

	//uni-directional many-to-one association to Resume
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;

	public PersonalInfo() {
	}

	public Long getPersonalInfoId() {
		return this.peronalInfoId;
	}

	public void setPersonalInfoId(Long personalInfoId) {
		this.peronalInfoId = personalInfoId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNameInFull() {
		return this.nameInFull;
	}

	public void setNameInFull(String nameInFull) {
		this.nameInFull = nameInFull;
	}

	public String getProfileSummary() {
		return this.profileSummary;
	}

	public void setProfileSummary(String profileSummary) {
		this.profileSummary = profileSummary;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Resume getResume() {
		return this.resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}