package com.safecode.resume.domain.resume.personalinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class PersonalInfoRestController {
	
	private PersonalInfoRepository personalInfoRepository;
	
	@Autowired
	public void setPersonalInfoRepository(PersonalInfoRepository personalInfoRepository) {
		this.personalInfoRepository = personalInfoRepository;
	}

	@GetMapping("/{userId}/personalinfo")
	public PersonalInfo getPersonalInfoByUser(@PathVariable Long userId) {
		return personalInfoRepository.findPersonalInfoByUserId(userId);
	}
}
