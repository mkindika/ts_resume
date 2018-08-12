package com.safecode.resume.domain.resume.education;

import java.util.List;

public interface EducationRepository {
	List<Education> getAllEducationByResume(Long resumeId);
}
