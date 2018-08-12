package com.safecode.resume.domain.resume.certificate;

import java.util.List;

public interface CertificateRepository{
	List<Certificate> getAllCertificatesByResume(Long resumeId);
}
