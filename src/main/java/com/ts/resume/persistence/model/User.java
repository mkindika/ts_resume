package com.ts.resume.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private String userId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date_time")
	private Date createdDateTime;

	private String email;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="last_login")
	private Timestamp lastLogin;

	private String password;

	@Column(name="user_type")
	private String userType;

	private String username;

	//bi-directional many-to-one association to Resume
	@OneToMany(mappedBy="user")
	private List<Resume> resumes;

	//uni-directional many-to-one association to UserType
	@ManyToOne
	@JoinColumn(name="fk_user_type_id")
	private UserType userTypeBean;

	public User() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreatedDateTime() {
		return this.createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Resume> getResumes() {
		return this.resumes;
	}

	public void setResumes(List<Resume> resumes) {
		this.resumes = resumes;
	}

	public Resume addResume(Resume resume) {
		getResumes().add(resume);
		resume.setUser(this);

		return resume;
	}

	public Resume removeResume(Resume resume) {
		getResumes().remove(resume);
		resume.setUser(null);

		return resume;
	}

	public UserType getUserTypeBean() {
		return this.userTypeBean;
	}

	public void setUserTypeBean(UserType userTypeBean) {
		this.userTypeBean = userTypeBean;
	}

}