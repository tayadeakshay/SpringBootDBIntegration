package com.pro.wings.service;

import java.util.List;

import com.pro.wings.entity.Employee;

public interface EmployeeService {

	public Employee save(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);

}
