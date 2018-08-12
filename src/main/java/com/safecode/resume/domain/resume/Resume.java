package com.safecode.resume.domain.resume;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.safecode.resume.util.jackson.CustomDateSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Resume implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long resumeId;
	
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date createdOnTime;
	
	@JsonSerialize(using = CustomDateSerializer.class) 
	private Timestamp lastAccessedTime;
	
	private String resumeName;
	private Long userId;
	private Short templateId;
}
