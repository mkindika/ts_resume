package com.ts.resume.domain.dto;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ts.resume.util.jackson.CustomDateSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResumeDTO {
	
	private Long resumeId;
	
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date createdOnTime;
	
	@JsonSerialize(using = CustomDateSerializer.class) 
	private Timestamp lastAccessedTime;
	private String resumeName;
	private Long userId;
	private Short templateId;
}
