package com.ts.resume.persistence.repos;

import org.springframework.data.repository.Repository;
import com.ts.resume.persistence.model.PersonalInfo;

public interface PersonalInfoRepository extends Repository<PersonalInfo, Long>, CustomPersonalInfoRepository{

}
