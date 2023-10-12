package com.globallogic.Service;

import com.globallogic.Entity.Movies;

import java.util.List;

public interface IMovieService {
   public Movies addMovie(Movies movie);

   public String removeMovie(int id);

    public Movies searchByTitle(String title);

    public Movies searchById(int id);

    public abstract List<Movies> getAllMovies();
}
