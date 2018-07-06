package com.ts.resume.persistence.repos;

import com.ts.resume.domain.dto.PersonalInfoDTO;

public interface CustomPersonalInfoRepository {
	PersonalInfoDTO findPersonalInfoByResumeId(final Long resumeId);
}
