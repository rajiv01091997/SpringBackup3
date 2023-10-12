package com.globallogic.Service;

import java.util.List;

import com.globallogic.Entity.Movie;
import com.globallogic.Repository.Repo;

public class ServiceImpl {
	Repo repo=new Repo();
public void addMovie(Movie movie)
{

	Movie mov=repo.findMovie(movie.getMovieId());
	if(mov!=null)
	{
		System.err.println("MOVIE WITH THIS ID ALREADY EXISTS");//exception instead
		return;
	}
	repo.addMovie(movie);
}

public Movie findMovie(int id)
{
	return repo.findMovie(id);
}

public List<Movie> getMovies(int year)
{
	return repo.getMovies(year);
}

public void deleteMovie(int id)
{
	repo.deleteMovie(id);
}
public void updateRevenue(int id, long revenue)
{
	repo.updateRevenue(id, revenue);
}

}
