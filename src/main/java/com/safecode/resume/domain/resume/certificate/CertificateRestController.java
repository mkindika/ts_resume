package com.safecode.resume.domain.resume.certificate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/resume")
public class CertificateRestController {
	
	private CertificateRepository certificateRepository;

	@Autowired
	public void setExperienceRepository(CertificateRepository certificateRepository) {
		this.certificateRepository = certificateRepository;
	}
	
	@GetMapping("/{resumeId}/certificate")
	public List<Certificate> getAllCertificatesByResume(@PathVariable Long resumeId) {
		return certificateRepository.getAllCertificatesByResume(resumeId);
	}

}
