package com.management.Leave.Management.models;

import org.springframework.stereotype.Component;

@Component
public class EmployBean {
	
	private long id;

	private String fname;
	
	private String lname;
	
	
	private String email;
	
	private String joinedDate;
	
	private String baselocation;
	
	private String location;
	
	private String branch;
	
	private String manager;
	private String role;
	
	
	public EmployBean() {
		super();
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getBaselocation() {
		return baselocation;
	}
	public void setBaselocation(String baselocation) {
		this.baselocation = baselocation;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getId() {
		return id;
	}
	

}
