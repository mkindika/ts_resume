package com.ts.resume.web.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.resume.domain.dto.CertificateDTO;
import com.ts.resume.domain.dto.EducationDTO;
import com.ts.resume.domain.dto.ExperienceDTO;
import com.ts.resume.domain.dto.PersonalInfoDTO;
import com.ts.resume.domain.dto.ResumeDTO;

@RestController
@RequestMapping("/api")
public class ResumeRestController extends BaseRestContoller {

	@GetMapping("/{userId}/resume")
	List<ResumeDTO> getResumes(@PathVariable String userId) {
		return resumeRepository.findAllResumeByUser(userId);
	}
	
	@GetMapping("/{userId}/resume/{resumeId}")
	ResumeDTO getResumeById(@PathVariable String resumeId) {
		return resumeRepository.findResumeById(resumeId);
	}
	
	@GetMapping("/{userId}/resume/{resumeId}/personalinfo")
	PersonalInfoDTO getPersonalInfoByResume(@PathVariable String userId,@PathVariable String resumeId) {
		return personalInfoRepository.findPersonalInfoByResumeId(resumeId);
	}
	
	@GetMapping("/{userId}/resume/{resumeId}/education")
	List<EducationDTO> getEducationByResume(@PathVariable String userId,@PathVariable String resumeId) {
		return educationRepository.getEducationListByResume(resumeId);
	}
	
	@GetMapping("/{userId}/resume/{resumeId}/experience")
	List<ExperienceDTO> getExperienceByResume(@PathVariable String userId,@PathVariable String resumeId) {
		return experienceRepository.getExperienceListByResume(resumeId);
	}
	
	@GetMapping("/{userId}/resume/{resumeId}/certificate")
	List<CertificateDTO> getCertificateByResume(@PathVariable String userId,@PathVariable String resumeId) {
		return certificateRepository.getCertificateListByResume(resumeId);
	}
	
	
}
