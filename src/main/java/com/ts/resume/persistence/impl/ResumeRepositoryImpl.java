package com.ts.resume.persistence.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.ts.resume.domain.dto.ResumeDTO;
import com.ts.resume.persistence.mapper.ResumeMapper;
import com.ts.resume.persistence.repos.CustomResumeRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ResumeRepositoryImpl extends BaseRepository implements CustomResumeRepository {

	@Override
	@Transactional(readOnly = true)
	public Collection<ResumeDTO> findAllResumeByUser(String userId) {

		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("userId", userId);
		List<ResumeDTO> searchResults = namedParameterJdbcTemplate
				.query(sqlQueries.getProperty("find.all.resumes.by.user.id"), namedParameters, new ResumeMapper());
		return searchResults;
	}

	@Override
	public ResumeDTO findResumeById(String resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		ResumeDTO searchResult = namedParameterJdbcTemplate.queryForObject(sqlQueries.getProperty("find.resume.by.id"),
				namedParameters, new ResumeMapper());
		return searchResult;
	}

}
