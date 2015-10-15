package com.test.plavaga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.test.plavaga.model.Department;
import com.test.plavaga.service.DepartmentService;

@Controller
@RequestMapping(value = "/department")
public class DepartmentController {
	  @Autowired
	  private DepartmentService departmentService;
	  
	  @RequestMapping(value = "/getByDeptno/{deptNo}", method = RequestMethod.GET)
	  @ResponseBody
	  public Department getByDeptno(@PathVariable(value = "deptNo") Integer deptNo) {
	    return departmentService.getLocation(deptNo);
	  }
	  
	  @RequestMapping(value = "/create", method = RequestMethod.POST)
	  @ResponseBody
	  public String create(@RequestBody Department department) {
	    return departmentService.create(department);
	  }
	  
	  @RequestMapping(value="/modify", method=RequestMethod.POST)
	  @ResponseBody
	  public String modify(@RequestBody Department department) {
	    return departmentService.modify(department);
	  }
	  	  
	  @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	  @ResponseBody
	  public String delete(@PathVariable(value = "id") Long id) {
		    return departmentService.delete(id);		    
	  }	  	 

	  @RequestMapping(value="/getDepartment/{deptNumber}/{deptName}", method=RequestMethod.GET)
	  @ResponseBody
	  public Department getByDepartment(@PathVariable(value="deptNumber") Integer deptNumber, @PathVariable(value="deptName") String deptName) {
		  return departmentService.getLocationDetails(deptNumber, deptName);
	  }
}
