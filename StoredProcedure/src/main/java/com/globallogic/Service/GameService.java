package com.globallogic.Service;

import com.globallogic.Entity.Game;
import com.globallogic.Repository.GameRepo;

public class GameService {
	
	GameRepo gameRepo=new GameRepo();
	
	public void insert(Game game)
	{
		gameRepo.insertRecord(game);
	}
	public void fetch()
	{
		gameRepo.fetchRecord();
	}
   public void delete(int id)
   {
	   gameRepo.delete(id);
   }
   public void update(int id, Game game)
   {
	   gameRepo.update(id,game);
   }
}
