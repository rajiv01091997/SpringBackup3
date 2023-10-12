package com.globallogic.Service;

import com.globallogic.Entity.Genres;

import java.util.List;

public interface IGenreService {

    Genres addGenre(Genres genre);

    String deleteById(int id);

    Genres searchByName(String name);

    Genres searchById(int id);

    List<Genres> getAllGenres();
}
