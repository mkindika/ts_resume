package com.safecode.resume.domain.resume.experience;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class ExperienceMapper implements RowMapper<Experience>{

	@Override
	public Experience mapRow(ResultSet rs, int rowNum) throws SQLException {
		Experience dto = new Experience();
		dto.setExperienceId(rs.getLong("experience_id"));
		dto.setCompanyName(rs.getString("company_name"));
		dto.setPositionHeld(rs.getString("position_held"));
		dto.setResumeId(rs.getLong("resume_id"));
		dto.setFromMonth(rs.getByte("from_month"));
		dto.setFromYear(rs.getShort("from_year"));
		dto.setToMonth(rs.getByte("to_month"));
		dto.setToYear(rs.getShort("to_year"));
		dto.setDescription(rs.getString("description"));
		return dto;
	}

}