package com.pro.wings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.wings.entity.Employee;
import com.pro.wings.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping
	public ResponseEntity<Employee> save(@RequestBody Employee emp)
	{
		Employee emp1 = empService.save(emp);
		return new ResponseEntity<Employee>(emp1,HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		return empService.getAllEmployees();
	}
	
	@GetMapping("{id}")
	public ResponseEntity getEmployeeById(@PathVariable int id)
	{
		try {
			Employee emp = empService.getEmployeeById(id);
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
			
		}catch (Exception e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

}
