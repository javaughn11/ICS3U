package campbell;

/*
 * PositiveNegativeandDivisbleby7.java
 * Positive, Negative and Divisible by 7 Exercise
 * Created on November 1, 2016
 * Made by Javaughn Campbell
 * Program displays if the number the user inserts is positive, negative and divisible by 7  
 */

import java.util.Scanner;

public class PositiveNegativeandDivisbleby7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter a number: "); 
		number = scan.nextInt();
		
		if (number > 0)
			System.out.println("\nYour number is positive");
		
		else
			System.out.println("Your number is negative");
			
		if (number%7 == 0)
			System.out.println("Your number is divisible by 7");
		
		else
			System.out.println("Your number is not divisible by 7");
	}

}
