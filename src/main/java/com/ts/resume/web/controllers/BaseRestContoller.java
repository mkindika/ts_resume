package com.ts.resume.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.ts.resume.persistence.repos.CertificateRepository;
import com.ts.resume.persistence.repos.EducationRepository;
import com.ts.resume.persistence.repos.ExperienceRepository;
import com.ts.resume.persistence.repos.PersonalInfoRepository;
import com.ts.resume.persistence.repos.ResumeRepository;

public abstract class BaseRestContoller {

	protected ResumeRepository resumeRepository;
	protected PersonalInfoRepository personalInfoRepository;
	protected EducationRepository educationRepository;
	protected ExperienceRepository experienceRepository;
	protected CertificateRepository certificateRepository;
	
	@Autowired
	public void setResumeRepository(ResumeRepository resumeRepository) {
		this.resumeRepository = resumeRepository;
	}
	
	@Autowired
	public void setPersonalInfoRepository(PersonalInfoRepository personalInfoRepository) {
		this.personalInfoRepository = personalInfoRepository;
	}
	
	@Autowired
	public void setEducationRepository(EducationRepository educationRepository) {
		this.educationRepository = educationRepository;
	}
	
	@Autowired
	public void setExperienceRepository(ExperienceRepository experienceRepository) {
		this.experienceRepository = experienceRepository;
	}

	@Autowired
	public void setCertificateRepository(CertificateRepository certificateRepository) {
		this.certificateRepository = certificateRepository;
	}
	
	
	
}
