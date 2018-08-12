package com.safecode.resume.domain.resume;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.safecode.resume.domain.resume.certificate.CertificateRestController;
import com.safecode.resume.domain.resume.education.EducationRestController;
import com.safecode.resume.domain.resume.experience.ExperienceRestController;
import com.safecode.resume.domain.resume.personalinfo.PersonalInfoRestController;


public class ResumeResource extends ResourceSupport{
	
	@JsonUnwrapped
	private final Resume resume;
	
	public ResumeResource(Resume resume) {
		this.resume = resume;
		Long userId = resume.getUserId();
		Long resumeId = resume.getResumeId();
		
		this.add(linkTo(methodOn(PersonalInfoRestController.class, userId).getPersonalInfoByUser(userId)).withSelfRel());
		this.add(linkTo(methodOn(ExperienceRestController.class, userId).getAllExperienceByResume(resumeId)).withSelfRel());
		this.add(linkTo(methodOn(EducationRestController.class, userId).getAllEducationByResume(resumeId)).withSelfRel());
		this.add(linkTo(methodOn(CertificateRestController.class, userId).getAllCertificatesByResume(resumeId)).withSelfRel());
		
	}
}
