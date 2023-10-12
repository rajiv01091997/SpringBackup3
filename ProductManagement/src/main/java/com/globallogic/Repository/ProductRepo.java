package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
