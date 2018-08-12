package com.safecode.resume.domain.resume.certificate;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.safecode.resume.common.BaseRepository;

@Repository
public class CertificateRepositoryImpl extends BaseRepository implements CertificateRepository{

	@Override
	@Transactional(readOnly = true)
	public List<Certificate> getAllCertificatesByResume(Long resumeId) {
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("resumeId", resumeId);
		List<Certificate> searchResults = namedParameterJdbcTemplate.query(
        		sqlQueries.getProperty("find.certificate.by.id"), 
        		namedParameters,
                new CertificateMapper()
        );
		return searchResults;
	}

}
