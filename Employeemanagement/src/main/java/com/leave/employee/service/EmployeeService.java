package com.leave.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leave.employee.exceptionhandler.EmployeeCustomException;
import com.leave.employee.models.Employee;

@Service
public interface EmployeeService {

	public List<Employee> listAll() throws EmployeeCustomException ;
	public List<Employee> addEmp(Employee Employee) throws EmployeeCustomException ;
	public Employee getEmp(long id) throws EmployeeCustomException ;
	public void deleteEmp(long id) throws EmployeeCustomException ;
	public Employee saveEMP(Employee employee) throws EmployeeCustomException ;


}
