package com.globallogic.Service;

import com.globallogic.Entity.Actors;
import com.globallogic.Entity.Movies;
import com.globallogic.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieService implements IMovieService {
    @Autowired
    private MovieRepository movieRepository;
   @Override
    public Movies addMovie(Movies movie)
    {
        return movieRepository.save(movie);
    }
    @Override
    public String removeMovie(int id)
    {
        movieRepository.deleteById(id);

        return "Record deleted";
    }
    @Override
    public Movies searchByTitle(String title)
    {
      return movieRepository.findByTitle(title);
    }
    @Override
    public Movies searchById(int id)
    {
        return movieRepository.findById(id).get();
    }
    @Override
    public List<Movies> getAllMovies()
    {
        return movieRepository.findAll();
    }
public List<Movies> getAllWithActors(Actors actors)
{
    return null;
}
}
