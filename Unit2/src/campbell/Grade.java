package campbell;

/* 
 * Grade.java
 * Grade, exercise 5 on page 94 
 * Created on November 4, 2016
 * Made by Javaughn Campbell
 * Program displays the letter grade for the percentage of a students graded work
 */

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		char grade;
		
		System.out.print("Enter the percentage: ");
		grade = (char) scan.nextFloat();
		
		if (grade >= 90.0)
			grade = 'A';
		
		else if (grade >= 80.0)
				 grade = 'B';
		
		else if (grade >= 70.0)
				 grade = 'C';
		
		else if(grade >= 60.0) 
			    grade = 'D';
		
		else 
			  grade = 'F';
		
		System.out.println("The corresponding letter grade is: "+ grade);
			
			
			
		
		
	}

}
