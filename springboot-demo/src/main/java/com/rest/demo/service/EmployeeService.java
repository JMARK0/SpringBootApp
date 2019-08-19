package com.rest.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.demo.repo.EmployeeRepository;
import com.rest.demo.bean.*;
@Service
public class EmployeeService {
	
EmployeeRepository empRepository;

    public List<Employee> getAllEmployee() {
        List<Employee> employee = new ArrayList<Employee>();
        empRepository.findAll().forEach(employe -> employee.add(employe));
        return employee;
    }

    public Employee getEmployeeId(String id) {
        return empRepository.findById(id).get();
    }


}
