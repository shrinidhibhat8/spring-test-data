/**
 * 
 */
package com.test.plavaga.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author shrinidhi
 *
 */
@Entity
@Table(name = "department")
public class Department {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long  		id;
	private Integer 	deptNo;	
	private String 		deptName;
    private String 		location;
    
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Long id) {
		super();
		this.id = id;
	}

	public Department(Integer deptNo, String deptName, String location) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.location = location;
	}
	
	public Department(Long id, Integer deptNo, String deptName, String location) {
		super();
		this.id = id;
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.location = location;
	}
  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
