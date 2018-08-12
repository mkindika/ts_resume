package com.safecode.resume.domain.resume;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class ResumeRestController{
	
	private ResumeRepository resumeRepository;
	
	
	@Autowired
	public void setResumeRepository(ResumeRepository resumeRepository) {
		this.resumeRepository = resumeRepository;
	}
	
	@RequestMapping(value="/{userId}/resume", method = RequestMethod.GET, produces = MediaTypes.HAL_JSON_VALUE)
	public Resources<ResumeResource> getResumes(@PathVariable Long userId) {
	
		return new Resources<>(resumeRepository
				.findAllResumeByUser(userId).stream()
				.map(ResumeResource::new)
				.collect(Collectors.toList()));
	}
	
	@GetMapping("/{userId}/resume/{resumeId}")
	public Resume getResumeById(@PathVariable Long resumeId) {
		return resumeRepository.findResumeById(resumeId);
		
	}
	
}
