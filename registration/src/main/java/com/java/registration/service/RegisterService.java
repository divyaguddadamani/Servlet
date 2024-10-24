package com.java.registration.service;

import com.java.registration.dto.RegisterDto;

public interface RegisterService {
	boolean validateAndSave(RegisterDto dto);

}
