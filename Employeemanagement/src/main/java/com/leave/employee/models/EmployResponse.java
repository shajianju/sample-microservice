package com.leave.employee.models;

import java.util.List;

import org.springframework.http.HttpStatus;

public class EmployResponse {

	private HttpStatus responseCode;
	
	private String port;

	private String response;

	private String errorCode;

	private boolean isError;

	private String description;

	private List<Employee> emplist;
	
	

	public EmployResponse() {
		super();
	}

	public HttpStatus getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(HttpStatus responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	@Override
	public String toString() {
		return "EmployResponse [responseCode=" + responseCode + ", response=" + response + ", errorCode=" + errorCode
				+ ", isError=" + isError + ", description=" + description + ", emplist=" + emplist + "]";
	}

	public EmployResponse(HttpStatus responseCode, String response, String errorCode, boolean isError, String description,
			List<Employee> emplist) {
		super();
		this.responseCode = responseCode;
		this.response = response;
		this.errorCode = errorCode;
		this.isError = isError;
		this.description = description;
		this.emplist = emplist;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}




}
