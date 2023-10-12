package com.globallogic.Repo;

import com.globallogic.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Department,Integer> {
}
