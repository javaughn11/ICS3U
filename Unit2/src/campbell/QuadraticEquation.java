package campbell;

/*
 * Quadratic Equation
 * Created on September 30, 2016
 * Made b Javaughn Campbell
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double a;
		double b;
		double c;
		
		System.out.println("Below, enter the 3 number that will substitue A, B, and C into the quadratic formula");
		System.out.println("");
		System.out.println("Enter the number subsistuting for the variable A below");
		a = scan.nextInt();
		System.out.println("");
		System.out.println("Enter the number subsistuting for the variable B below");
		b = scan.nextInt();
		System.out.println("");
		System.out.println("Enter the number subsistuting for the variable C below");
		c = scan.nextInt();
		System.out.println("");
		
		
		System.out.print("x=");System.out.println(df.format((-1*b+Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a)));
		
		System.out.print("x=");System.out.println(df.format((-1*b-Math.sqrt((Math.pow(b,2))-(4*a*c)))/(2*a)));
	}

}
