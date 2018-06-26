package com.ts.resume.persistence.impl;

import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public abstract class BaseRepository{
	
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Resource(name="sqlQueries")
	protected Properties sqlQueries;
	
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
}
