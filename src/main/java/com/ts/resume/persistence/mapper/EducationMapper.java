package com.ts.resume.persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ts.resume.domain.dto.EducationDTO;

public class EducationMapper implements RowMapper<EducationDTO>{

	@Override
	public EducationDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EducationDTO dto = new EducationDTO();
		dto.setDegree(rs.getString(""));
		dto.setDescription(rs.getString(""));
		dto.setEducationId(rs.getLong(""));
		dto.setFieldOfStudy(rs.getString(""));
		dto.setFromMonth(rs.getByte(""));
		dto.setFromYear(rs.getByte(""));
		dto.setSchool(rs.getString(""));
		dto.setToMonth(rs.getByte(""));
		dto.setToYear(rs.getByte(""));
		return null;
	}

}
