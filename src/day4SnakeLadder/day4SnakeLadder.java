package day4SnakeLadder;

import java.util.Scanner;

public class day4SnakeLadder {



		static final int WinningPosition = 100;

	    public static void main(String[] args) {
	        int playerPosition = 0;
	        int n;
	        System.out.println(+playerPosition+" " + "This is the players starting Position");
	        System.out.println("Rolls the dice to get number ");
	        int i = 0;
	        while (playerPosition != WinningPosition) {
	        	int number = 1 + (int) (Math.random() * 6);
	        	 int option = (int) Math.floor(Math.random() * 3);
	            
	            switch (option) {
	                case 1:
	                    System.out.println("Play");
	                    System.out.println("Dice " + number);
	                   
	                    if (option == 0) {
	                        System.out.println("No Play");
	                        playerPosition = playerPosition;
	                        System.out.println("Player position is " + playerPosition);
	                    }
	                    else if (option == 1) {
	                        System.out.println("Ladder came");
	                        if (playerPosition < WinningPosition)
	                            playerPosition = playerPosition + number;
	                        else
	                            playerPosition = playerPosition - number;
	                            System.out.println("Player position is " + playerPosition);
	                    }
	                    else {
	                        System.out.println("Snake came");
	                        playerPosition = playerPosition - number;
	                        if (playerPosition < 0)
	                            playerPosition=0;
	                            System.out.println("Player position is " + playerPosition);
	                    }
	                    break;
	                case 2:
	                    System.out.println("exit");
	                    
	                case 3:
	                    System.out.println("Invalid input");
	                    break;
	            }
	            i++ ;
	        }
	        System.out.println("Player Position is " + playerPosition);
	        System.out.println("Total Moves = " + i);
	    }
	}