package com.safecode.resume.domain.resume.education;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.safecode.resume.common.BaseRepository;

@Repository
public class EducationRepositoryImpl extends BaseRepository implements EducationRepository{

	@Override
	@Transactional(readOnly = true)
	public List<Education> getAllEducationByResume(Long resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		List<Education> searchResults = namedParameterJdbcTemplate.query(
        		sqlQueries.getProperty("find.education.by.id"), 
        		namedParameters,
                new EducationMapper()
        );
		return searchResults;
	}

}
