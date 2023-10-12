package com.globallogic.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.globallogic.Connection.DBconnection;
import com.globallogic.Entity.Movie;

public class Repo {

	public void addMovie(Movie movie)
	{
		try {
		Connection con=DBconnection.connect();
		PreparedStatement ps=con.prepareStatement("insert into Movies values(?,?,?,?,?)");
		ps.setInt(1, movie.getMovieId());
		ps.setString(2, movie.getName());
		ps.setString(3, movie.getLanguage());
		ps.setInt(4, movie.getReleaseYear());
		ps.setLong(5, movie.getRevenue());
		
		boolean val=ps.execute();
		if(val==false)
			System.out.println("Inserted Movie with id:"+ movie.getMovieId());
		else
			System.out.println("can't insert!!!!!!!!!!!");
		
		ps.close();
		con.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public Movie findMovie(int id)
	{
		Movie movie=null;
		try {
		Connection con=DBconnection.connect();
		PreparedStatement ps=con.prepareStatement("select * from Movies where id=?");
		ps.setInt(1, id);
		ResultSet rs =ps.executeQuery();
		while(rs.next())
		{
			movie=new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getLong(5));
			
		}
		rs.close();
		ps.close();
		con.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return movie;
		
	}
	public List<Movie> getMovies(int year)
	{
		List<Movie> list=new ArrayList<>();
		try 
		{
			Connection con=DBconnection.connect();
			PreparedStatement ps=con.prepareStatement("select * from Movies where releaseYear>=?");
			ps.setInt(1, year);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Movie movie=new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getLong(5));
				list.add(movie);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	public void deleteMovie(int id)
	{
		try
		{
			Connection connection=DBconnection.connect();
			PreparedStatement ps=connection.prepareStatement("delete from Movies where id=?" );
			ps.setInt(1, id);
			int num=ps.executeUpdate();
			System.out.println("number of row deleted: "+num);
			ps.close();
			connection.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateRevenue(int id,long revenue)
	{
		try
			{
				Connection con=DBconnection.connect();
				PreparedStatement ps=con.prepareStatement("update Movies set revenue=revenue+? where id=?");
				ps.setLong(1, revenue);
				ps.setInt(2, id);
				int n=ps.executeUpdate();
				if(n==0)
					System.out.println("Movie with given id not present");
				else
					System.out.println("update successfully");
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
}
