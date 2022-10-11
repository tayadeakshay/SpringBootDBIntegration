package com.pro.wings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.wings.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
}
