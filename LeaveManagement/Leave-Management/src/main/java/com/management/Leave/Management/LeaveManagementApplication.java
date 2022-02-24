package com.management.Leave.Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LeaveManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveManagementApplication.class, args);
	}

}
