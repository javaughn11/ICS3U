/**
 * Random2.java
 * Exercise 2, Random 2
 * Created on November 11, 2016
 * Made by Javaughn Campbell
 * Program displays a dice game where a random number is rolled
 */ 
package campbell;

import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);	
		
		int die1;
		int die2;
		int scoreuser;
		int scorecpu;
		String question;
	
		System.out.print("Would you like to play? ");
		question = scan.nextLine();
		
		
	do{	
		die1 = (int)(Math.random()*6+1);
		die2 = (int)(Math.random()*6+1);
		scoreuser = die1 + die2;
		
		die1 = (int)(Math.random()*6+1);
		die2 = (int)(Math.random()*6+1);
		scorecpu = die1 + die2;
		
		System.out.println("\nyour score is: " + scoreuser);
		System.out.println("The computers score: " + scorecpu);
	
		
	if (scoreuser == scorecpu)
		System.out.println("It's a tie");
	
	else if (scoreuser > scorecpu)
	      System.out.println("YOU WON!\n");
	
	else
		  System.out.println("The computer won, you lost\n");
	      System.out.print("Would you like to play again? ");
	      question = scan.nextLine();
	
	}while (question. equals ("yes"));	
		
		
	}

}
