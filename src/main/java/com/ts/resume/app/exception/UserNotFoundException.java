package com.ts.resume.app.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String userId) {
		super("could not find user '" + userId + "'.");
	}
}