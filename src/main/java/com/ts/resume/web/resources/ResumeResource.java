package com.ts.resume.web.resources;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.ts.resume.domain.dto.ResumeDTO;
import com.ts.resume.web.controllers.ResumeRestController;


public class ResumeResource extends ResourceSupport{
	
	@JsonUnwrapped
	private final ResumeDTO resume;
	
	public ResumeResource(ResumeDTO resume) {
		this.resume = resume;
		Long userId = resume.getUserId();
		Long resumeId = resume.getResumeId();
		
		
		this.add(linkTo(methodOn(ResumeRestController.class, userId).getPersonalInfoByResume(userId, resumeId)).withSelfRel());
		this.add(linkTo(methodOn(ResumeRestController.class, userId).getEducationByResume(userId, resumeId)).withSelfRel());
	}
}
