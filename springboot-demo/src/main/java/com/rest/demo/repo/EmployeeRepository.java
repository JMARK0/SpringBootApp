package com.rest.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.rest.demo.bean.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, String>  {

}
