package com.globallogic.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.globallogic.Connection.DBconnection;
import com.globallogic.Entity.Game;
import com.mysql.cj.jdbc.CallableStatement;

public class GameRepo {

	public void insertRecord(Game game)
	{
		try 
		{
		Connection connection=DBconnection.connect();
		java.sql.CallableStatement callableStatement=connection.prepareCall("{call insertnew(?,?,?)}");
		callableStatement.setInt(1, game.getGameId());
		callableStatement.setString(2, game.getGameName());
		callableStatement.setInt(3, game.getNoOfPlayers());
		callableStatement.execute();
		System.out.println("new record inserted");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void fetchRecord()
	{ 
		try 
		{
		Connection connection=DBconnection.connect();
		java.sql.CallableStatement callableStatement=connection.prepareCall("{call selectAll}");
		ResultSet rs=callableStatement.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void delete(int id)
	{
		try
		{
		Connection connection=DBconnection.connect();
		CallableStatement callableStatement=(CallableStatement) connection.prepareCall("{call deleteById(?)}");
		callableStatement.setInt(1, id);
		callableStatement.executeUpdate();
		System.out.println("Delete with id= "+id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public void update(int id, Game game) {
		try {
		Connection connection=DBconnection.connect();
		CallableStatement  callableStatement=(CallableStatement) connection.prepareCall("{call update2(?,?,?)}");
		callableStatement.setInt(1, id);
		callableStatement.setString(2, game.getGameName());
		callableStatement.setInt(3, game.getNoOfPlayers());
		callableStatement.executeUpdate();
		System.out.println("updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
