package com.globallogic.Service;

import com.globallogic.Entity.Genres;
import com.globallogic.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenreService implements IGenreService {
    @Autowired
    private GenreRepository genreRepository;
    @Override
    public Genres addGenre(Genres genre)
    {
        return genreRepository.save(genre);
    }
    @Override
    public String deleteById(int id)
    {
        genreRepository.deleteById(id);
        return "Record Deleted";
    }
    @Override
    public Genres searchByName(String name)
    {
        return genreRepository.findByName(name);
    }
    @Override
    public Genres searchById(int id)
    {
        return genreRepository.findById(id).get();
    }
    @Override
    public List<Genres> getAllGenres()
    {
       return genreRepository.findAll();
    }
}
