package com.ts.resume.domain.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CertificateDTO {
	private Long certificateId;
	private String authority;
	private String codeUrl;
	private String description;
	private Date dateIssued;
	private String name;
	private Long resumeId;
}
