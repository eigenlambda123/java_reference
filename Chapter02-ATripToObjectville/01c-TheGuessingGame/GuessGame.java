public class GuessGame {		
	
	// player instances
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {

		// create new player objects and assign to instance variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		// guesses placeholder
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		// true of false based on the guesses Players make
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		// random number to guess
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		
		while(true) {
			System.out.println("Number to guess is " + targetNumber);
		
			// call each player's guess() method
			p1.guess();
			p2.guess();
			p3.guess();
			
			// player1 guess()
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);

			// player2 guess()
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);

			// player3 guess()
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);

			// check each player's guess to the target number, is guess of atleast one player is correct, then set to true
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
				
			// if atleast one of the player is correct, the we print the following. Otherwise, continue looping
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break;

			} else {
			  System.out.println("Players will have to try again.");
			}
		}
	}
}


