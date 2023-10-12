package com.globallogic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.Entity.Employee;
import com.globallogic.Repository.EmployeeRepo;

@RestController
@RequestMapping("emp/")
public class EmployeeController{
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("")
	public ResponseEntity<Employee> save(@RequestBody  Employee emp)
	{
		return new ResponseEntity<>(employeeRepo.save(emp),HttpStatus.OK);
	}

}
