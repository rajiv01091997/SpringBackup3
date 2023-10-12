package com.globallogic.Repository;

import com.globallogic.Entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movies,Integer> {
    public Movies findByTitle(String title);
}
