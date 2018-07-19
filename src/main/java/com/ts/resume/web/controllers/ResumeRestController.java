package com.ts.resume.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.resume.domain.dto.PersonalInfoDTO;
import com.ts.resume.domain.dto.ResumeDTO;
import com.ts.resume.persistence.repos.PersonalInfoRepository;
import com.ts.resume.persistence.repos.ResumeRepository;

@RestController
@RequestMapping("/api")
public class ResumeRestController {
	
	private final ResumeRepository resumeRepository;
	private final PersonalInfoRepository personalInfoRepository;
	
	@Autowired
	ResumeRestController(ResumeRepository resumeRepository, PersonalInfoRepository personalInfoRepository){
		this.resumeRepository = resumeRepository;
		this.personalInfoRepository = personalInfoRepository;
	}

	@GetMapping("/{userId}/resume")
	List<ResumeDTO> getResumes(@PathVariable String userId) {
		return this.resumeRepository.findAllResumeByUser(userId);
	}
	
	@GetMapping("/{userId}/resume/{resumeId}")
	ResumeDTO getResumeById(@PathVariable String resumeId) {
		return this.resumeRepository.findResumeById(resumeId);
	}
	
	
	@GetMapping("/{userId}/resume/{resumeId}/personalinfo")
	PersonalInfoDTO getPersonalInfoByResume(@PathVariable String userId,@PathVariable String resumeId) {
		return this.personalInfoRepository.findPersonalInfoByResumeId(resumeId);
	}
}
