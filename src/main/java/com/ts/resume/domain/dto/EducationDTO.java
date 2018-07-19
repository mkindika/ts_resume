package com.ts.resume.domain.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class EducationDTO {
	private Long educationId;
	private String school;
	private String degree;
	private String fieldOfStudy;
	private String description;
	private short fromYear;
	private short toYear;
	private byte fromMonth;
	private byte toMonth;
}
