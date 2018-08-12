package com.safecode.resume.domain.resume.experience;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.safecode.resume.common.BaseRepository;

@Repository
public class ExperienceRepositoryImpl extends BaseRepository implements ExperienceRepository{

	@Override
	@Transactional(readOnly = true)
	public List<Experience> getAllExperienceByResume(Long resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		List<Experience> searchResults = namedParameterJdbcTemplate.query(
        		sqlQueries.getProperty("find.experience.by.id"), 
        		namedParameters,
                new ExperienceMapper()
        );
		return searchResults;
	}

}
