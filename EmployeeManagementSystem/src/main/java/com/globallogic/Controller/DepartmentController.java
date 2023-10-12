package com.globallogic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Entity.Department;
import com.globallogic.Repository.DepartmentRepo;

@RestController
@RequestMapping("dept/")
public class DepartmentController {
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@PostMapping("")
	public ResponseEntity<Department> save(@RequestBody Department department)
	{
		return new ResponseEntity<>(departmentRepo.save(department), HttpStatus.OK);
	}
	

}
