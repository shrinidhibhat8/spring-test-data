package com.test.plavaga.service;

import org.springframework.stereotype.Service;

import com.test.plavaga.model.Department;


public interface DepartmentService {
	
	Department getLocation(Integer deptNumber);
	String create(Department department);
	String modify(Department department);
	String delete(Long id);
	Department getLocationDetails(Integer deptNumber, String deptName);

}