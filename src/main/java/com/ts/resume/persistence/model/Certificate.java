package com.ts.resume.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the certificate database table.
 * 
 */
@Entity
@NamedQuery(name="Certificate.findAll", query="SELECT c FROM Certificate c")
public class Certificate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="certificate_id")
	private Long certificateId;

	private String authority;

	@Column(name="code_url")
	private String codeUrl;

	@Lob
	private String description;

	@Column(name="date_issued")
	private Date dateIssued;
	
	private String name;


	//bi-directional many-to-one association to Resume
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;

	public Certificate() {
	}

	public Long getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getCodeUrl() {
		return this.codeUrl;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	public Resume getResume() {
		return this.resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

}