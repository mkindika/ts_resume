package com.ts.resume.persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ts.resume.domain.dto.PersonalInfoDTO;

public class PersonalInfoMapper implements RowMapper<PersonalInfoDTO> {

	@Override
	public PersonalInfoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		PersonalInfoDTO dto = new PersonalInfoDTO();
		dto.setTitle(rs.getString("title"));
		dto.setFirstName(rs.getString("first_name"));
		dto.setLastName(rs.getString("last_name"));
		dto.setNameInFull(rs.getString("name_in_full"));
		dto.setDob(rs.getDate("dob"));
		dto.setEmail(rs.getString("email"));
		dto.setHomePhone(rs.getString("home_phone"));
		dto.setMobile(rs.getString("mobile"));
		dto.setPeronalInfoId(rs.getLong("personal_info_id"));
		dto.setProfileSummary(rs.getString("profile_summary"));
		dto.setAddressId(rs.getLong("address_id"));
		dto.setCity(rs.getString("city"));
		dto.setCountry(rs.getString("country"));
		dto.setState(rs.getString("state"));
		dto.setStreet(rs.getString("street"));
		dto.setPostalCode(rs.getString("postal_code"));
		
		return dto;
	}

}
