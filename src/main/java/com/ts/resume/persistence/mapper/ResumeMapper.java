package com.ts.resume.persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ts.resume.domain.dto.ResumeDTO;

public class ResumeMapper implements RowMapper<ResumeDTO>{

	@Override
	public ResumeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ResumeDTO resume = new ResumeDTO();
		resume.setResumeId(rs.getLong("resume_id"));
		resume.setTemplateId(rs.getShort("template_id"));
		resume.setUserId(rs.getLong("user_id"));
		resume.setResumeName(rs.getString("resume_name"));
		resume.setCreatedOnTime(rs.getDate("created_on_time"));
		resume.setLastAccessedTime(rs.getTimestamp(("last_accessed_time")));
		return resume;
	}

}
