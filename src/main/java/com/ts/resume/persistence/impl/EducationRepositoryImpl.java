package com.ts.resume.persistence.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ts.resume.domain.dto.EducationDTO;
import com.ts.resume.persistence.repos.CustomEducationRepository;

@Repository
public class EducationRepositoryImpl extends BaseRepository implements CustomEducationRepository{

	@Override
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	@Override
	public List<EducationDTO> getEducationListByResume(String resumeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
