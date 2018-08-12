package com.safecode.resume.domain.resume.certificate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class CertificateMapper implements RowMapper<Certificate>{

	@Override
	public Certificate mapRow(ResultSet rs, int rowNum) throws SQLException {
		Certificate dto = new Certificate();
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
