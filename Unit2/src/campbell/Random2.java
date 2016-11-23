/**
 * Random2.java
 * Exercise 2, Random 2
 * Created on November 11, 2016
 * Made by Javaughn Campbell
 * Program displays a dice game where a random number is rolled
 */ 
package campbell;

public class Random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int die1;
		int die2;
		int scoreuser;
		int scorecpu;
		
		
		die1 = (int)(Math.random()*6+1);
		die2 = (int)(Math.random()*6+1);
		scoreuser = die1 + die2;
		
		die1 = (int)(Math.random()*6+1);
		die2 = (int)(Math.random()*6+1);
		scorecpu = die1 + die2;
		
		System.out.println("your score is: " + scoreuser);
		System.out.println("The computers score: " + scorecpu);
		
	if (scoreuser == scorecpu)
		System.out.println("It's a tie");
	
	else if (scoreuser > scorecpu)
	      System.out.println("YOU WON!");
	
	else
		  System.out.println("The computer won, you lost");
	
		
		
		
	}

}
