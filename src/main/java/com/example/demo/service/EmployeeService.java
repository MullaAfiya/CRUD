package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service     
public class EmployeeService {
	@Autowired
	private EmployeeRepository rep;
   public void AddEmployee (Employee e) {
		
		rep.save(e);
	}


}
