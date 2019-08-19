package com.rest.db.demo.dao;

import org.springframework.stereotype.Repository;

import com.rest.db.demo.model.Employee;
import com.rest.db.demo.model.Employees;

@Repository
public class EmployeeDAO {
	private static Employees list = new Employees();

	static {
		list.getEmployeeList().add(new Employee(1, "JANA", "raj", "jrmy@gmail.com"));
		list.getEmployeeList().add(new Employee(2, "Janardhanraj", "M", "jrm3425@gmail.com"));
		list.getEmployeeList().add(new Employee(3, "jans", "marks", "jany@gmail.com"));
	}

	public Employees getAllEmployees() {
		return list;
	}

	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}
}
