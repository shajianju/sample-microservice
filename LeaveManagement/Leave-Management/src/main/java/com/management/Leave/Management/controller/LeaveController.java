package com.management.Leave.Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.management.Leave.Management.models.EmployBean;
import com.management.Leave.Management.service.LeaveProxy;

@RestController
public class LeaveController {

	
	@Autowired
	LeaveProxy leaveProxy;
	@GetMapping("/get")
	public EmployBean get() {
		EntityResponse<EmployBean> bean= leaveProxy.getEmp();
		return bean.entity();
				
	}
}
