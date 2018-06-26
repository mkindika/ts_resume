package com.ts.resume.persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ts.resume.domain.dto.EducationDTO;

public class EducationMapper implements RowMapper<EducationDTO>{

	@Override
	public EducationDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EducationDTO dto = new EducationDTO();
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
