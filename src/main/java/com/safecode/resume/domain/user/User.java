package com.safecode.resume.domain.user;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.safecode.resume.domain.resume.personalinfo.PersonalInfo;
import com.safecode.resume.util.jackson.CustomDateSerializer;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Data
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long userId;
	
	private String username;

	@JsonSerialize(using = CustomDateSerializer.class)
	private Date createdDateTime;

	private String email;

	private byte isActive;

	private Timestamp lastLogin;

	private String password;

	private String userType;

	
}