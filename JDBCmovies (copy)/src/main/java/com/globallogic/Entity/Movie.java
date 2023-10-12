package com.globallogic.Entity;

public class Movie {
	
private int movieId;
private String name;
private String language;
private int releaseYear;
private long revenue;

public Movie() {
	super();
	
}

public Movie(int movieId, String name, String language, int releaseYear, long revenue) {
	super();
	this.movieId = movieId;
	this.name = name;
	this.language = language;
	this.releaseYear = releaseYear;
	this.revenue = revenue;
}

public int getMovieId() {
	return movieId;
}

public void setMovieId(int movieId) {
	this.movieId = movieId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public int getReleaseYear() {
	return releaseYear;
}

public void setReleaseYear(int releaseYear) {
	this.releaseYear = releaseYear;
}

public long getRevenue() {
	return revenue;
}

public void setRevenue(long revenue) {
	this.revenue = revenue;
}

@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", name=" + name + ", language=" + language + ", releaseYear=" + releaseYear
			+ ", revenue=" + revenue + "]";
}



}
