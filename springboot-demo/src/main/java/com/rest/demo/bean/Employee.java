package com.rest.demo.bean;

public class Employee {
	private String id = null;
	private String employeeFirstName = null;
	private String employeeLastName = null;
	private String employeeAge = null;
	private String employeeExp = null;

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeExp() {
		return employeeExp;
	}

	public void setEmployeeExp(String employeeExp) {
		this.employeeExp = employeeExp;
	}

	public String getEmployeeID() {
		return id;
	}

	public void setEmployeeID(String id) {
		this.id = id;
	}
}
