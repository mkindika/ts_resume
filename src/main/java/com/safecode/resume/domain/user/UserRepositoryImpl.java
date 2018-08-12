package com.safecode.resume.domain.user;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.safecode.resume.common.BaseRepository;

@Repository
public class UserRepositoryImpl extends BaseRepository implements UserRepository{

	@Override
	@Transactional(readOnly = true)
	public User findUserById(String username) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("username", username);
		User searchResults = namedParameterJdbcTemplate.queryForObject(
        		sqlQueries.getProperty("find.user.by.name"), 
        		namedParameters,
                new UserMapper()
        );
		return searchResults;
	}

}