package com.globallogic.Dao;

import com.globallogic.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    public List<Product> findAllByPriceGreaterThan(int price);
}
