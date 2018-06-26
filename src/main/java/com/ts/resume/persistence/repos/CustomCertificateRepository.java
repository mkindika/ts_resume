package com.ts.resume.persistence.repos;

import java.util.List;

import com.ts.resume.domain.dto.CertificateDTO;

public interface CustomCertificateRepository {
	List<CertificateDTO> getCertificateListByResume(String resumeId);
}
