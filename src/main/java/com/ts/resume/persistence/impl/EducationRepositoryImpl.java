package com.ts.resume.persistence.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ts.resume.domain.dto.EducationDTO;
import com.ts.resume.persistence.mapper.EducationMapper;
import com.ts.resume.persistence.repos.CustomEducationRepository;

@Repository
public class EducationRepositoryImpl extends BaseRepository implements CustomEducationRepository{
	
	@Override
	@Transactional(readOnly = true)
	public List<EducationDTO> getEducationListByResume(Long resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		List<EducationDTO> searchResults = namedParameterJdbcTemplate.query(
        		sqlQueries.getProperty("find.education.by.id"), 
        		namedParameters,
                new EducationMapper()
        );
		return searchResults;
	}

}
