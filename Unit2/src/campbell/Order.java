package campbell;

import java.text.DecimalFormat;
import java.util.Scanner;

 /*
  *Order.java 
  *Order, on page 74., Exercise 10
  *Created on October 3, 2016
  *Made by Javaughn Campbell
  *Displays The calculations of the price for burgers, fries and sodas before tax and after tax
  */

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int numBurgers;
		int numFries;
		int numSodas;
		
		System.out.print("Enter the number of burgers: "); 
		numBurgers = scan.nextInt();
		System.out.print("\nEnter the number of fries: ");
		numFries = scan.nextInt();
		System.out.print("\nEnter the number of sodas: ");
		numSodas = scan.nextInt();
		double beforetax =(numBurgers*1.69)+(numFries*1.09)+(numSodas*0.99);
		System.out.print("\nTotal before tax: " + df.format(beforetax));
		double tax = (beforetax*0.065);
		System.out.print("\nTax: "+df.format(tax));
		double aftertax = (tax+beforetax);
		System.out.print("\nFinal total: "+df.format(aftertax));
		                                                                                                                                
		
		
		
		
	}

}
