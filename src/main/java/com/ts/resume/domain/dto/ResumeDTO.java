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
	
	@JsonProperty 
	private Long resumeId;
	
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonProperty 
	private Date createdOnTime;
	
	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonProperty 
	private Timestamp lastAccessedTime;
	
	@JsonProperty 
	private String resumeName;
	
	@JsonProperty 
	private Long userId;
}
