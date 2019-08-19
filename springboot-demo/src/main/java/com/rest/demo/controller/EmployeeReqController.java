package com.rest.demo.controller;

import java.util.List;

import com.rest.demo.bean.Employee;
import com.rest.demo.service.EmployeeService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeReqController {

	EmployeeService employeeService;
	
	    @GetMapping("/employees")
	    private List<Employee> getAllEmployee() {
	        return employeeService.getAllEmployee();
	    }

	    @GetMapping("/employees/{id}")
	    private Employee getEmployeeById (@PathVariable("id") String id ) {
	        return employeeService.getEmployeeId(id);
	    }
	
		
		

	

}
