package com.ts.resume.persistence.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ts.resume.domain.dto.CertificateDTO;
import com.ts.resume.persistence.mapper.CertificateMapper;
import com.ts.resume.persistence.repos.CustomCertificateRepository;

@Repository
public class CertificateRepositoryImpl extends BaseRepository implements CustomCertificateRepository{

	@Override
	@Transactional(readOnly = true)
	public List<CertificateDTO> getCertificateListByResume(String resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		List<CertificateDTO> searchResults = namedParameterJdbcTemplate.query(
        		sqlQueries.getProperty("find.certificate.by.id"), 
        		namedParameters,
                new CertificateMapper()
        );
		return searchResults;
	}

}
