package com.example.Cruds.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cruds.Model.Entity;
import com.example.Cruds.Service.Iservice;

@RestController
@RequestMapping("/api/v3")
public class EmployeeController {
	@Autowired
	private Iservice iservice;
   @PostMapping("/save")
	public ResponseEntity<Entity> saveEntity(@RequestBody Entity entity) {
		return new ResponseEntity<>(iservice.saveEmployee(entity), HttpStatus.ACCEPTED);
	}
   @GetMapping("/")
   public ResponseEntity<List<Entity>> getAll()
   {
	   return new ResponseEntity<>(iservice.getEmployees(), HttpStatus.OK);
   }
   @GetMapping("/get")
   public ResponseEntity<Entity> getById(@PathVariable int id)
   {
	   return new ResponseEntity<Entity>(iservice.getById(id), HttpStatus.OK);
   }
   @GetMapping("/{address}")
   public ResponseEntity<List<Entity>> getByAddress(@PathVariable  String address)
   {
	return new ResponseEntity<List<Entity>>(iservice.getByAddress(address), HttpStatus.OK);
	   
   }
  
   
   
   
   
   
   
}
