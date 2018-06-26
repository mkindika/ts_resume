package com.ts.resume.domain.dto;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PersonalInfoDTO {

	private Long peronalInfoId;

	private String email;

	private String firstName;

	private String homePhone;

	private String lastName;

	private String mobile;

	private String nameInFull;

	private Date dob;

	private String profileSummary;

	private String title;

	private Long addressId;

	private String street;

	private String city;

	private String state;

	private String country;

	private String postalCode;
}
