package com.ts.resume.persistence.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ts.resume.domain.dto.ExperienceDTO;
import com.ts.resume.persistence.mapper.ExperienceMapper;
import com.ts.resume.persistence.repos.CustomExperienceRepository;

@Repository
public class ExperienceRepositoryImpl extends BaseRepository implements CustomExperienceRepository{


	@Override
	@Transactional(readOnly = true)
	public List<ExperienceDTO> getExperienceListByResume(String resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		List<ExperienceDTO> searchResults = namedParameterJdbcTemplate.query(
        		sqlQueries.getProperty("find.experience.by.id"), 
        		namedParameters,
                new ExperienceMapper()
        );
		return searchResults;
	}

}
