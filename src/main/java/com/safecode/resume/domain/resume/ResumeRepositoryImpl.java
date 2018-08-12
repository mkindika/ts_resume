package com.safecode.resume.domain.resume;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.safecode.resume.common.BaseRepository;

@Repository
public class ResumeRepositoryImpl extends BaseRepository implements ResumeRepository {

	@Override
	@Transactional(readOnly = true)
	public List<Resume> findAllResumeByUser(Long userId) {

		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("userId", userId);
		List<Resume> searchResults = namedParameterJdbcTemplate
				.query(sqlQueries.getProperty("find.all.resumes.by.user.id"), namedParameters, new ResumeMapper());
		return searchResults;
	}

	@Override
	public Resume findResumeById(Long resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		Resume searchResult = namedParameterJdbcTemplate.queryForObject(sqlQueries.getProperty("find.resume.by.id"),
				namedParameters, new ResumeMapper());
		return searchResult;
	}

}
