package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
