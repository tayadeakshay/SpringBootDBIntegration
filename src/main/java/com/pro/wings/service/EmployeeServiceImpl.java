package com.pro.wings.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pro.wings.dao.EmployeeDao;
import com.pro.wings.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao empDao;
	
	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return empDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> fetchedEmployee =empDao.findById(id);
		
		if(fetchedEmployee.isPresent())
		return fetchedEmployee.get();
		else {
			System.out.println("Employee not present of id : "+id);
			return null;
		}
	}

}
