package com.ts.resume.persistence.repos;

import java.util.List;

import com.ts.resume.domain.dto.ResumeDTO;

public interface CustomResumeRepository {
	
	List<ResumeDTO> findAllResumeByUser(String userId);
	ResumeDTO findResumeById(String resumeId);
}
