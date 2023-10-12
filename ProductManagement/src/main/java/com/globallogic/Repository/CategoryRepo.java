package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
