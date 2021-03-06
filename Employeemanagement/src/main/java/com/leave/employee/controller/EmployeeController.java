package com.leave.employee.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leave.employee.exceptionhandler.EmployeeCustomException;
import com.leave.employee.models.EmployBean;
import com.leave.employee.models.EmployResponse;
import com.leave.employee.models.Employee;
import com.leave.employee.serviceImpl.EmployServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployServiceImpl employServiceImpl;
	
	@Autowired
	Environment environment;

	@GetMapping("/emp/leave/getAllEMP")
	public EmployResponse getList() {

		EmployResponse response=new EmployResponse();
		List<Employee> emplList=null;
		try {
			emplList=employServiceImpl.listAll();
			response=new EmployResponse(HttpStatus.CREATED, "SUCCESS", null, false, "List of employees", emplList);
		} catch (EmployeeCustomException e) {
			response=new EmployResponse(HttpStatus.INTERNAL_SERVER_ERROR, "FAILED", null, false, "No Records", null);
		}
		response.setPort(environment.getProperty("local.server.port"));
		return response;

	}

	@PostMapping("/emp/leave/addEMP")
	public EmployResponse addEmp(@Valid @RequestBody  EmployBean bean) {
		EmployResponse response=new EmployResponse();
		List<Employee> emplList=null;

		try {
			employServiceImpl.addEmp(new Employee(bean.getFname(), bean.getLname(), new Date(), bean.getBranch(), bean.getBaselocation(), bean.getEmail(), bean.getLocation(), bean.getRole(),Long.valueOf(bean.getManager()) ));
			emplList=employServiceImpl.listAll();
			response=new EmployResponse(HttpStatus.CREATED, "SUCCESS", null, false, "EMP Added", emplList);

		}
		catch (EmployeeCustomException e) {
			response=new EmployResponse(HttpStatus.INTERNAL_SERVER_ERROR, "FAILED", null, false, "No EMP added", emplList);
		}
		response.setPort(environment.getProperty("local.server.port"));

		return response;

	}

	@GetMapping("/emp/leave/getEmpl/{id}")
	public EmployResponse getEmp(@PathVariable long id) {

		EmployResponse response=new EmployResponse();

		List<Employee> emplList=new ArrayList<>();

		try {
			if(null==employServiceImpl.getEmp(id)) {
				response= new EmployResponse(HttpStatus.INTERNAL_SERVER_ERROR, "FAILED", null, false, "No EMP found for id= "+id, null);

			}
			else 
				emplList.add(employServiceImpl.getEmp(id));
			return new EmployResponse(HttpStatus.OK, "SUCCESS", null, false, "Data found", emplList);
		} catch (EmployeeCustomException e) {
			response= new EmployResponse(HttpStatus.INTERNAL_SERVER_ERROR, "FAILED", null, false, e.getMessage(), emplList);
		}
		response.setPort(environment.getProperty("local.server.port"));
		return response;
	}

	@PostMapping("/emp/leave/saveEMP")
	public EmployResponse editEMP(@Valid @RequestBody  EmployBean bean) {
		EmployResponse response=new EmployResponse();

		try {
			
			if(null==employServiceImpl.getEmp(bean.getId())) {
				response= new EmployResponse(HttpStatus.INTERNAL_SERVER_ERROR, "FAILED", null, false, "No EMP found for id= "+bean.getId(), new ArrayList<>());

			}
			employServiceImpl.saveEMP(new Employee(bean.getId(),bean.getFname(), bean.getLname(), new Date(), bean.getBranch(), bean.getBaselocation(), bean.getEmail(), bean.getLocation(), bean.getRole(),Long.valueOf(bean.getManager()) ));
			response=new EmployResponse(HttpStatus.CREATED, "SUCCESS", null, false, "EMP Added", employServiceImpl.listAll());

		}
		catch (EmployeeCustomException e) {
			response=new EmployResponse(HttpStatus.INTERNAL_SERVER_ERROR, "FAILED", null, false, "No EMP added", new ArrayList<>());
		}
		response.setPort(environment.getProperty("local.server.port"));
		return response;

	}

	@DeleteMapping("/emp/leave/removeEMP{id}")
	public EmployResponse removeEMP(@PathVariable long id) {
		EmployResponse response=new EmployResponse();
		List<Employee> emplList=new ArrayList<>();

		try {
			employServiceImpl.deleteEmp(id);
			emplList=employServiceImpl.listAll();
			response=new EmployResponse(HttpStatus.CREATED, "SUCCESS", null, false, "EMP Removed From List", emplList);

		}
		catch (EmployeeCustomException e) {
			response=new EmployResponse(HttpStatus.INTERNAL_SERVER_ERROR, "FAILED", null, false, "No EMP added", emplList);
		}
		response.setPort(environment.getProperty("local.server.port"));
		return response;

	}

}
