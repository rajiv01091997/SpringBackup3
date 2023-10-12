package com.globallogic.Application;

import com.globallogic.Entity.Game;
import com.globallogic.Service.GameService;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GameService gameService=new GameService();
		
		
		int k=1;
		
		while(k>=1)
		{
			System.out.println("=================================================================");
		System.out.println("Enter 1 for insertion");
		System.out.println("Enter 2 fetching all records");
		System.out.println("Enter 3 to delete");
		System.out.println("Enter 4 to update");
		System.out.println("Enter 5 to Exit");
		System.out.println("=================================================================");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter gameId,NoOfPlayers,gameName");
			int id=sc.nextInt();
			int number=sc.nextInt();
			String name=sc.next();
			Game game=new Game(id,name,number);
			gameService.insert(game);
			break;
		case 2:
			gameService.fetch();
			break;
			
		case 3:
			System.out.println("enter id");
			int Gid=sc.nextInt();
			gameService.delete(Gid);
			break;
		case 4:
			System.out.println("Enter the id of game to be updated");
			int GaId=sc.nextInt();
			System.out.println("enter new noOfPlayersName and gameName");
			int n=sc.nextInt();
			String na=sc.next();
			Game newGame=new Game(GaId,na,n);
			gameService.update(GaId,newGame);
			break;
			
		case 5:
			k=-1;
			System.out.println("Exiting application........................");
			break;
			
		}
		}
		
		

	}

}
