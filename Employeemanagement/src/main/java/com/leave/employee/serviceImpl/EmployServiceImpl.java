package com.leave.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leave.employee.exceptionhandler.EmployeeCustomException;
import com.leave.employee.models.Employee;
import com.leave.employee.repository.EmployeeRepository;
import com.leave.employee.service.EmployeeService;

@Component
public class EmployServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repository;

	@Override
	public List<Employee> listAll() throws EmployeeCustomException {
		return repository.findAll();
	}

	@Override
	public List<Employee> addEmp(Employee Employee) throws EmployeeCustomException {
		repository.save(Employee);
		return repository.findAll();
	}

	@Override
	public Employee getEmp(long id) throws EmployeeCustomException {
		
		return null!=repository.findById(id)&&!repository.findById(id).isEmpty()?repository.findById(id).get():null;
	}

	@Override
	public void deleteEmp(long id) throws EmployeeCustomException {
		repository.deleteById(id);
	}

	@Override
	public Employee saveEMP(Employee employee) throws EmployeeCustomException {
		return repository.saveAndFlush(employee);
	}




}
