package com.ts.resume.persistence.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ts.resume.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
