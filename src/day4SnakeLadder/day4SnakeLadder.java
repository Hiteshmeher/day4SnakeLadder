package day4SnakeLadder;

public class day4SnakeLadder {

	static final int NoPlay = 0, Snake = 1, Ladder = 2;

	public static void main(String[] args) {
		class getPosition {
			 
		int position1 = new getPosition().position;
		int position2 = new getPosition().position;
		
		int position = 0, diceroll;
		
		boolean player1 = true;
		boolean player2 = false ;
		
		
		while(position1 < 100 && position2 < 100) {
			diceroll = getDiceRoll();
			
			switch(getOption()) {
				case NoPlay :
					position = position;
					break;
				case Snake :
					position -= diceroll;
					break;
				case Ladder :
					position += diceroll;
					continue;
			}
			
			if( position > 0) {
				if (player1) {
					position1 += position;
					position = 0;
					player1 = false;
					player2  = true;
				}
				else {
					position2 += position;
					position = 0;
					player2  = false;
					player1 = true;
				}
			}
			
			else {
				position = 0;
			}	
		}
	if(position1>position2) {
		System.out.println("Winner Player1");
	}
	else {
		System.out.println("Winner Player2");
	}
	
	}

	private static int getOption() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int getDiceRoll() {
		// TODO Auto-generated method stub
		return 0;
	}
}