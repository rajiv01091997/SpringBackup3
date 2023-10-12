package com.globallogic.Application;

import com.globallogic.Entity.Movie;
import com.globallogic.Service.ServiceImpl;

public class Main {

	public static void main(String[] args) {
		
ServiceImpl impl=new ServiceImpl();



Movie mov1=new Movie(104,"Ponean Selvan","Hindi",2022,7300000);
impl.addMovie(mov1);


//System.out.println(impl.findMovie(102));

//System.out.println(impl.getMovies(2022));

//impl.deleteMovie(105);


//impl.updateRevenue(101, 5000);
	}

}
