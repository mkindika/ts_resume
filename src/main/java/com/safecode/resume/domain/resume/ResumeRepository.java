package com.safecode.resume.domain.resume;

import java.util.List;

public interface ResumeRepository{
	List<Resume> findAllResumeByUser(Long userId);
	Resume findResumeById(Long resumeId);
}