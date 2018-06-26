package com.ts.resume.persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ts.resume.domain.dto.CertificateDTO;

public class CertificateMapper implements RowMapper<CertificateDTO>{

	@Override
	public CertificateDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CertificateDTO dto = new CertificateDTO();
		dto.setAuthority(rs.getString("authority"));
		dto.setCertificateId(rs.getLong("certificate_id"));
		dto.setCodeUrl(rs.getString("code_url"));
		dto.setDateIssued(rs.getDate("date_issued"));
		dto.setDescription(rs.getString("description"));
		dto.setName(rs.getString("name"));
		dto.setResumeId(rs.getLong("resume_id"));
		return dto;
	}

}
