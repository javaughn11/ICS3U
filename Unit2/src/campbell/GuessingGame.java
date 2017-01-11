/**
 * GuessingGame.java
 * Guessing game, exercise 9 on page 96
 * Created on November 23, 2016
 * Made by Javaughn Campbell
 * Program displays a guessing game where the users number must match the computers number+-------------
 */

package campbell;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int secretnum;
		int playernum;
		
		System.out.print("Enter a number between 1 and 20: ");
		playernum = scan.nextInt();
		
		secretnum = (int) (Math.random()*20+1);
		System.out.println("Computer's number: " + secretnum);
		
		System.out.println("Player's number: " + playernum);
		
		if	(playernum == secretnum)
			System.out.println("YOU WON!");
		
		else   
			System.out.println("Better luck next time.");
			
		
	}

}
