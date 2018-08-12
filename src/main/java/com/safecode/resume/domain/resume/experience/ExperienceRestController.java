package com.safecode.resume.domain.resume.experience;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/resume")
public class ExperienceRestController {
	
	private ExperienceRepository experienceRepository;

	@Autowired
	public void setExperienceRepository(ExperienceRepository experienceRepository) {
		this.experienceRepository = experienceRepository;
	}
	
	@GetMapping("/{resumeId}/experience")
	public List<Experience> getAllExperienceByResume(@PathVariable Long resumeId) {
		return experienceRepository.getAllExperienceByResume(resumeId);
	}

}
