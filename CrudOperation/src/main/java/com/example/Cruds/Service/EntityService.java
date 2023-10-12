package com.example.Cruds.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cruds.Model.Entity;
import com.example.Cruds.repo.Repository;

@Service
public class EntityService implements Iservice {
	@Autowired
	private Repository repository;

	@Override
	public Entity saveEmployee(Entity entity) {
		repository.save(entity);
		return entity;
	}

	@Override
	public List<Entity> getEmployees() {
		// TODO Auto-generated method stub
		System.out.println("getting data from db"+repository.findAll());
		return repository.findAll();

	}

	@Override
	public Entity getById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Entity> getByAddress(String address) {
		return repository.findByAddress(address);
	}
	

}
