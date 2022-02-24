package com.management.Leave.Management.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.function.EntityResponse;

import com.management.Leave.Management.models.EmployBean;

@FeignClient(name = "Employee-Management" ,url = "localhost:8080")
public interface LeaveProxy {

	@GetMapping("/emp/leave/getAllEMP")
	public EntityResponse<EmployBean> getEmp() ;

}
