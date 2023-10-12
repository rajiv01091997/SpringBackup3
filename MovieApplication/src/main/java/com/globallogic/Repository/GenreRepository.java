package com.globallogic.Repository;

import com.globallogic.Entity.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genres,Integer> {

    public Genres findByName(String name);
}
