package com.example.Cruds.Service;

import java.util.List;

import com.example.Cruds.Model.Entity;

public interface Iservice {

	//public Entity getEmployee();

	public Entity saveEmployee(Entity entity);

	 public List<Entity> getEmployees();

	Entity getById(int id);

	List<Entity> getByAddress(String address);

}
