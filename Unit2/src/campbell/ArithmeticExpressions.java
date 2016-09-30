package campbell;

import java.util.Scanner;
/*
 * Arithmetic Expressions assignment
 * made by javaughn
 * Created on September 27, 2016
 */

public class ArithmeticExpressions {
	
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	
	System.out.println("Enter five Numbers below");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	num3 = scan.nextInt();
	num4 = scan.nextInt();
	num5 = scan.nextInt();
	
	int sum = (num1+num2+num3+num4+num5);
	System.out.println("The sum of the 5 numbers you chose is "+sum+"\n");
	
	int sub = (num3-num2);
	System.out.println("The result of subtracting the secound from the third is "+sub+"\n");
	
	int product = (num1*num5); 
	System.out.println("The product if the first and fifth numbers is "+product+"\n");
	
	int quotient = (num4/num2);
	System.out.println("The quotient of the fourth number divided by the secound is "+ quotient+"\n");
	
	int remainder = (num4%num2);
	System.out.println("The remainder when dividing the fourth number by the secound "+remainder+"\n");
					
	int power = (int) Math.pow(num1,num3);
	System.out.println("The first number raised to the power of the secound number is "+power+"\n");
	
	int square = (int) Math.sqrt(num5);
	System.out.println("The square root of the fifth number is "+square+"\n");		
			
	}

}
