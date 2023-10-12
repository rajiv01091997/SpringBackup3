package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
