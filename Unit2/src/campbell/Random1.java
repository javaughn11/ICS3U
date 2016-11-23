/**
 * Random1.java
 * Exercise 1, Random 1
 * Created on November 14, 2016
 * Made by Javaughn Campbell
 * Program displays weather a persons name is the users favourite or hated
 */ 

package campbell;

import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String  name;
		double  percent;
		
		System.out.print("Enter your name: ");
		name = scan.nextLine(); 
		
		percent = Math.random();
		
		if (percent <= 0.7)
			System.out.print("That name is your favourite");
		
		else 
			  System.out.print("You hate that name");
		
		
		
		
	}

}
