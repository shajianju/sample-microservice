package com.leave.employee.models;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TBL_EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;

	@Column(name = "first_name",nullable = false,updatable = false)
	private String firstName;

	@Column(name = "last_name",nullable = false,updatable = false)
	private String lastName;

	@Column(name ="joined_date" ,nullable = false,updatable = false)
	private Date joinedDate;

	@Column(name = "branch_location")
	private String branchLocation;

	@Column(name = "base_location")
	private String baseLocation;

	@Column(name = "email")
	private String email;

	@Column(name="acconunt_name")
	private String accountName;

	@Column(name = "user_role")
	private String role;

	@Column(name = "manager_id")
	private Long managerId;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public Employee(String firstName, String lastName, Date joinedDate, String branchLocation, String baseLocation,
			String email, String accountName, String role, Long managerId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinedDate = joinedDate;
		this.branchLocation = branchLocation;
		this.baseLocation = baseLocation;
		this.email = email;
		this.accountName = accountName;
		this.role = role;
		this.managerId = managerId;
	}

	
	public Employee(Long empId, String firstName, String lastName, Date joinedDate, String branchLocation,
			String baseLocation, String email, String accountName, String role, Long managerId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinedDate = joinedDate;
		this.branchLocation = branchLocation;
		this.baseLocation = baseLocation;
		this.email = email;
		this.accountName = accountName;
		this.role = role;
		this.managerId = managerId;
	}

	public Employee() {
		super();
	}
	
	
}
