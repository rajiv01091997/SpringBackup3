package com.globallogic.Repository;

import com.globallogic.Entity.Actors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actors,Integer> {
    public List<Actors> findAllByYearOfBirthGreaterThan(int yearOfBirth);
    public List<Actors> findAllByFirstNameEndingWith(String suffix);
}
