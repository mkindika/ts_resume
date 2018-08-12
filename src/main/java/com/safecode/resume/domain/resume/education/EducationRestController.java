package com.safecode.resume.domain.resume.education;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/resume")
public class EducationRestController {
	
	private EducationRepository educationRepository;

	@Autowired
	public void setExperienceRepository(EducationRepository educationRepository) {
		this.educationRepository = educationRepository;
	}
	
	@GetMapping("/{resumeId}/education")
	public List<Education> getAllEducationByResume(@PathVariable Long resumeId) {
		return educationRepository.getAllEducationByResume(resumeId);
	}

}
