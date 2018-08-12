package com.safecode.resume.domain.resume.personalinfo;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.safecode.resume.common.BaseRepository;


@Repository
public class PersonalInfoRepositoryImpl extends BaseRepository implements PersonalInfoRepository{

	@Override
	@Transactional(readOnly = true)
	public PersonalInfo findPersonalInfoByUserId(Long userId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("userId", userId);
		PersonalInfo searchResults = namedParameterJdbcTemplate.queryForObject(
        		sqlQueries.getProperty("find.resume.personalinfo"), 
        		namedParameters,
                new PersonalInfoMapper()
        );
		return searchResults;
	}

}
