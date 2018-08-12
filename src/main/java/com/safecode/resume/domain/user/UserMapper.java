package com.safecode.resume.domain.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setCreatedDateTime(rs.getDate("created_date_time"));
		user.setEmail(rs.getString("email"));
		user.setIsActive(rs.getByte("is_active"));
		user.setLastLogin(rs.getTimestamp("last_login"));
		user.setUserId(rs.getLong("user_id"));
		user.setUserType(rs.getString("user_type"));
		return user;
	}
}
