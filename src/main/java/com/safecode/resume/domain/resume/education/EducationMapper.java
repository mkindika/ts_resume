package com.safecode.resume.domain.resume.education;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EducationMapper implements RowMapper<Education>{

	@Override
	public Education mapRow(ResultSet rs, int rowNum) throws SQLException {
		Education dto = new Education();
		dto.setDegree(rs.getString("degree"));
		dto.setDescription(rs.getString("description"));
		dto.setEducationId(rs.getLong("education_id"));
		dto.setFieldOfStudy(rs.getString("field_of_study"));
		dto.setFromMonth(rs.getByte("from_month"));
		dto.setFromYear(rs.getShort("from_year"));
		dto.setSchool(rs.getString("school"));
		dto.setToMonth(rs.getByte("to_month"));
		dto.setToYear(rs.getShort("to_year"));
		dto.setResumeId(rs.getLong("resume_id"));
		return dto;
	}

}
