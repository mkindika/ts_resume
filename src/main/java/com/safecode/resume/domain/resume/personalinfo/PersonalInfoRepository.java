package com.safecode.resume.domain.resume.personalinfo;

public interface PersonalInfoRepository{
	PersonalInfo findPersonalInfoByUserId(final Long resumeId);
}
