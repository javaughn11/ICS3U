package campbell;

import java.util.Scanner;

/*Listofnames.java
 *Made by Javaughn Campbell
 *Created on Monday, January 9,2017
 *program displays List of names that the user entered
 */

public class Listofnames {



	public static void main(String[] args) {

		


		Scanner scan = new Scanner (System.in);

		System.out.println("How many names do you want?");

		
		int numNames = Integer.parseInt(scan.nextLine());

		String [] names = new String [numNames];

	

		System.out.println("\nEnter all the names you want");

		for (int i=0; i<numNames; i++)

		{

			names[i] = scan.nextLine();

		}

	
		System.out.println("\nThese are the names you entered");

		for (int i=0; i<numNames; i++)

		{

			System.out.println(names[i]);

		}

		
		System.out.println("\nNow the names from last to first");

		for (int i=numNames-1; i>=0; i-- )

		{

			System.out.println(names[i]);

		}

	}



}
