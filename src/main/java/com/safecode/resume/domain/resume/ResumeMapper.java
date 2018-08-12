package com.safecode.resume.domain.resume;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class ResumeMapper implements RowMapper<Resume>{

	@Override
	public Resume mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Resume resume = new Resume();
		resume.setResumeId(rs.getLong("resume_id"));
		resume.setTemplateId(rs.getShort("template_id"));
		resume.setUserId(rs.getLong("user_id"));
		resume.setResumeName(rs.getString("resume_name"));
		resume.setCreatedOnTime(rs.getDate("created_on_time"));
		resume.setLastAccessedTime(rs.getTimestamp(("last_accessed_time")));
		return resume;
	}

}
