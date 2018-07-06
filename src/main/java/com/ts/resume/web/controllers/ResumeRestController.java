package com.ts.resume.web.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ts.resume.domain.dto.CertificateDTO;
import com.ts.resume.domain.dto.EducationDTO;
import com.ts.resume.domain.dto.ExperienceDTO;
import com.ts.resume.domain.dto.PersonalInfoDTO;
import com.ts.resume.domain.dto.ResumeDTO;
import com.ts.resume.web.resources.ResumeResource;


@RestController
@RequestMapping("/api")
public class ResumeRestController extends BaseRestContoller {

	@RequestMapping(value="/user/{userId}/resume", method = RequestMethod.GET, produces = MediaTypes.HAL_JSON_VALUE)
	public Resources<ResumeResource> getResumes(@PathVariable String userId) {
	
		return new Resources<>(resumeRepository
				.findAllResumeByUser(userId).stream()
				.map(ResumeResource::new)
				.collect(Collectors.toList()));
	}
	
	@GetMapping("/user/{userId}/resume/{resumeId}")
	public ResumeDTO getResumeById(@PathVariable String resumeId) {
		return resumeRepository.findResumeById(resumeId);
		
	}
	
	@GetMapping("/user/{userId}/resume/{resumeId}/personalinfo")
	public PersonalInfoDTO getPersonalInfoByResume(@PathVariable Long userId,@PathVariable Long resumeId) {
		return personalInfoRepository.findPersonalInfoByResumeId(resumeId);
	}
	
	@GetMapping("/user/{userId}/resume/{resumeId}/education")
	public List<EducationDTO> getEducationByResume(@PathVariable Long userId,@PathVariable Long resumeId) {
		return educationRepository.getEducationListByResume(resumeId);
	}
	
	@GetMapping("/user/{userId}/resume/{resumeId}/experience")
	public List<ExperienceDTO> getExperienceByResume(@PathVariable String userId,@PathVariable String resumeId) {
		return experienceRepository.getExperienceListByResume(resumeId);
	}
	
	@GetMapping("/user/{userId}/resume/{resumeId}/certificate")
	public List<CertificateDTO> getCertificateByResume(@PathVariable String userId,@PathVariable String resumeId) {
		return certificateRepository.getCertificateListByResume(resumeId);
	}
	
	
}
