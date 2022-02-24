package com.leave.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leave.employee.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{}
