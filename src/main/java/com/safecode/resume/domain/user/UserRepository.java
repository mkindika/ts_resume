package com.safecode.resume.domain.user;


public interface UserRepository{
	User findUserById(String username);
}