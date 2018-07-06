package com.ts.resume.persistence.repos;

import java.util.Collection;


import com.ts.resume.domain.dto.ResumeDTO;

public interface CustomResumeRepository {
	
	Collection<ResumeDTO> findAllResumeByUser(String userId);
	ResumeDTO findResumeById(String resumeId);
}
