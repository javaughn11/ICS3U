package campbell;

/*
 * Printing.java
 * Printing, exercise 1 on page 93
 * Created on November 2,2016
 * Made by Javaughn Campbell
 * Program displays the price per copy and the total cost of the number of copies printed
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int copies;
		double price;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		System.out.print("Enter the numbers to be printed: "); 
		copies = scan.nextInt();
		
		if (copies <= 99)
			price = 0.30;
			
		else if (copies <= 499)
					price = 0.28;
			
		else if (copies <= 749)
					price = 0.27;
		
		else if (copies <= 1000)
					price = 0.26;
			
		else
				price = 0.25;
		
			System.out.println("Price per copy is: $"+ price);
			System.out.println("Total cost is: $"+ (df.format(price*copies)));
		
			
		
	}

}
