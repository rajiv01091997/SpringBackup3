package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
