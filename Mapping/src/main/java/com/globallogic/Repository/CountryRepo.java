package com.globallogic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.Entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{

}
