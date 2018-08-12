package com.safecode.resume.domain.resume.certificate;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Certificate {
	private Long certificateId;
	private String authority;
	private String codeUrl;
	private String description;
	private Date dateIssued;
	private String name;
	private Long resumeId;
}
