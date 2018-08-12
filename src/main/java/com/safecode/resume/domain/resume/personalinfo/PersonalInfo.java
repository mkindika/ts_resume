package com.safecode.resume.domain.resume.personalinfo;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.safecode.resume.util.jackson.CustomDateSerializer;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PersonalInfo {

	private Long peronalInfoId;

	private String email;

	private String firstName;

	private String homePhone;

	private String lastName;

	private String mobile;

	private String nameInFull;

	@JsonSerialize(using = CustomDateSerializer.class)
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
