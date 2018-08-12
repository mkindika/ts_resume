package com.safecode.resume.domain.resume.experience;

import java.util.List;

public interface ExperienceRepository {
	List<Experience> getAllExperienceByResume(Long resumeId);
}
