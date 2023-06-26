package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService ser;
	
	@GetMapping("/")//it will run this home method first
	public String Home()////// this will become my first page and it will return my view i.e index (html page)
	{
		
		return "index";
	}
	
	@GetMapping("/AddEmployee")//when ever add employee link will be clicked this will get executed
	public String AddEmployee()
	{
		
		return "AddEmployee";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute Employee e)
	{
		System.out.println(e);
		ser.AddEmployee(e);
		return "AddEmployee";
	}


}



 
