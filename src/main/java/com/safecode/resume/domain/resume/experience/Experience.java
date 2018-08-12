package com.safecode.resume.domain.resume.experience;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Experience {
	private Long experienceId;
	private String companyName;
	private byte fromMonth;
	private short fromYear;
	private String positionHeld;
	private byte toMonth;
	private short toYear;
	private Long resumeId;
	private String description;
}
