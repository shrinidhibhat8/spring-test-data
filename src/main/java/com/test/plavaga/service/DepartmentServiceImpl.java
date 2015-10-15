/**
 * 
 */
package com.test.plavaga.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.plavaga.App;
import com.test.plavaga.model.Department;
import com.test.plavaga.repository.DepartmentRepository;

/**
 * @author shrinidhi
 *
 */
@Component
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	private static final Log	log			= LogFactory.getLog(Department.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.service.DepartmentService#getDeptName(java.lang.Integer)
	 */
	public Department getLocation(Integer deptNumber) {
		Department department = null;
		try {
			department= departmentRepository.findByDeptNo(deptNumber);
		} catch (Exception e) {
			e.printStackTrace();
			return department;
		}
		return department;
	}

	public String create(Department department) {
		try {
			departmentRepository.save(department);
		} catch (Exception e) {
			e.printStackTrace();
			return  "Error creating the department: " + e.toString();
		}
		return "Department succesfully created! (id : " + department.getId() + ")";
	}

	public String modify(Department department) {
		try {			
			//log.info(department.toString());
			Department dept = departmentRepository.findOne(department.getId());
			dept = new Department(department.getId(), department.getDeptNo(), department.getDeptName(), department.getLocation());
			departmentRepository.save(dept);
		} catch (Exception e) {
			e.printStackTrace();
			return  "Error updating the department: " + e.toString();
		}
		return "Department succesfully updated! (id : " + department.getId() + ")";
	}

	public String delete(Long id) {
		try {	
			departmentRepository.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return  "Error updating the department: " + e.toString();
		}
		return "Department succesfully deleted!";
	}

	public Department getLocationDetails(Integer deptNumber, String deptName) {
		Department department = null;
		try {
			department= departmentRepository.findByDeptNoAndDeptName(deptNumber, deptName);
		} catch (Exception e) {
			e.printStackTrace();
			return department;
		}
		return department;
	}
	
	
}
