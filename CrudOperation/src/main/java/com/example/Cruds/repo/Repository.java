package com.example.Cruds.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Cruds.Model.Entity;

public interface Repository extends JpaRepository<Entity, Integer>{

	public List<Entity> findByAddress(String address);
}
