package com.ts.resume.persistence.repos;

import java.util.List;

import com.ts.resume.domain.dto.EducationDTO;

public interface CustomEducationRepository {
	List<EducationDTO> getEducationListByResume(Long resumeId);
}
