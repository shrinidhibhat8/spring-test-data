package com.test.plavaga.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.plavaga.model.Department;

@org.springframework.transaction.annotation.Transactional
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	//@Query(value = "select d from Department d where d.deptNo=?1")
	public Department findByDeptNo(Integer deptNo);
	public Department findByDeptNoAndDeptName(Integer deptNo, String deptName);
}
