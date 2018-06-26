package com.ts.resume.persistence.repos;

import java.util.List;

import com.ts.resume.domain.dto.ExperienceDTO;

public interface CustomExperienceRepository {
	List<ExperienceDTO> getExperienceListByResume(String resumeId);
}
