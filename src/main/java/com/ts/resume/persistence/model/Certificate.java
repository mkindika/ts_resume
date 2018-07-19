package com.ts.resume.persistence.model;

import java.io.Serializable;
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

	@Column(name="month_issued")
	private byte monthIssued;

	private String name;

	@Column(name="year_issued")
	private short yearIssued;

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

	public byte getMonthIssued() {
		return this.monthIssued;
	}

	public void setMonthIssued(byte monthIssued) {
		this.monthIssued = monthIssued;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getYearIssued() {
		return this.yearIssued;
	}

	public void setYearIssued(short yearIssued) {
		this.yearIssued = yearIssued;
	}

	public Resume getResume() {
		return this.resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

}