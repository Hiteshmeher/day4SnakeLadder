package day4SnakeLadder;

public class day4SnakeLadder {

	public static void main(String[] args) {
		 int playerPosition = 0;
		 	System.out.println("Welcome to Snake Ladder Game");
	        System.out.println("Players starting Position is " +playerPosition);
	        int number = 1 + (int)(Math.random() * 6);
	        System.out.println("After rolling the dice i got " + number);
	        
	        int option = (int) Math.floor(Math.random()*3);
	        if (option == 0) {
	            System.out.println("No Play");
	            playerPosition = playerPosition;
	            System.out.println("Player current position is " + playerPosition);
	        }
	        else if (option == 1) {
	            System.out.println("Ladder");
	            playerPosition = playerPosition + number;
	            System.out.println("Player current position is " +playerPosition);
	        }
	        else {
	            System.out.println("Snake");
	            playerPosition = playerPosition - number;
	            if (playerPosition < 0) {
	            	playerPosition = 0;
	            }
	            System.out.println("Player current position is " + playerPosition);
	        }
	    }
	}