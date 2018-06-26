package com.ts.resume.persistence.impl;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ts.resume.domain.dto.PersonalInfoDTO;
import com.ts.resume.persistence.mapper.PersonalInfoMapper;
import com.ts.resume.persistence.repos.PersonalInfoRepository;

@Repository
public class PersonalInfoRepositoryImpl extends BaseRepository implements PersonalInfoRepository{

	@Override
	@Transactional(readOnly = true)
	public PersonalInfoDTO findPersonalInfoByResumeId(String resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		PersonalInfoDTO searchResults = namedParameterJdbcTemplate.queryForObject(
        		sqlQueries.getProperty("find.resume.personalinfo"), 
        		namedParameters,
                new PersonalInfoMapper()
        );
		return searchResults;
	}

	

}
