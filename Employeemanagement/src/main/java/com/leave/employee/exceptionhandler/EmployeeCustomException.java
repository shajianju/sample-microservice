package com.leave.employee.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
@Controller
public class EmployeeCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
