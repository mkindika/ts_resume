package com.safecode.resume.domain.resume.education;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Education {
	private Long educationId;
	private String school;
	private String degree;
	private String fieldOfStudy;
	private String description;
	private short fromYear;
	private short toYear;
	private byte fromMonth;
	private byte toMonth; 
	private Long resumeId;
}
