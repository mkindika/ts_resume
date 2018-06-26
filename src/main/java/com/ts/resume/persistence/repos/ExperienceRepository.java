package com.ts.resume.persistence.repos;

import org.springframework.data.repository.Repository;

import com.ts.resume.persistence.model.Resume;

public interface ExperienceRepository extends Repository<Resume, Long>, CustomExperienceRepository{

}
